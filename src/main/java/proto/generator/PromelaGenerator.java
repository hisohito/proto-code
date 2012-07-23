// **********************************************************************
// Proto Project
//
// Copyright (c) 2012 Julia Shatilina <julia.shatilina@gmail.com>
//
// Licensed under the Apache License, Version 2.0 (the "License");
// You may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// **********************************************************************

package proto.generator;

import java.io.*;
import java.util.*;

import proto.constants.*;
import proto.ir.*;

public class PromelaGenerator implements Generator {

    /**
     * Generate specifications for promela model
     * 
     * @param automata
     *            - automata of proto source system
     * @return Collection<String> - list og specifications
     */
    private Collection<String> generateSpecs(Automata automata) {
        Set<String> allSpec = new HashSet<String>();
        Collection<String> specs = automata.specs();
        for (String spec : specs) {
            // replace words
            spec = spec
                    .replaceAll(Constants.PML_FINALLY, Constants.SPIN_FINALLY)
                    .replaceAll(Constants.PML_GLOBALLY, Constants.SPIN_GLOBALLY)
                    .replaceAll(Constants.PML_UNTIL, Constants.SPIN_UNTIL)
                    .replaceAll(Constants.PML_RELEASE, Constants.SPIN_RELEASE);
            spec = spec.replaceAll(Constants.PML_NOT, Constants.SPIN_NOT)
                    .replaceAll(Constants.PML_AND, Constants.SPIN_AND)
                    .replaceAll(Constants.PML_OR, Constants.SPIN_OR)
                    .replaceAll(Constants.PML_IF, Constants.SPIN_IF);
            String tmp[] = spec.split(" ");
            StringBuilder oneSpec = new StringBuilder();
            for (String string : tmp) {
                if (!string.equals(Constants.SPIN_RELEASE)
                        && !string.equals(Constants.SPIN_IF)
                        && !string.equals(Constants.SPIN_OR)
                        && !string.equals(Constants.SPIN_AND)
                        && !string.equals(Constants.SPIN_UNTIL)
                        && !string.equals(Constants.SPIN_NOT)
                        && !string.equals(Constants.SMBL_LEFT_BRACE)
                        && !string.equals(Constants.SMBL_RIGHT_BRACE)
                        && !string.equals(Constants.SMBL_LEFT_RBRACE)
                        && !string.equals(Constants.SMBL_RIGHT_RBRACE)
                        && !string.equalsIgnoreCase(Constants.SPIN_GLOBALLY)
                        && !string.equalsIgnoreCase(Constants.SPIN_FINALLY)) {
                    if (automata.hasState(string)) {
                        // insert state 'stateA1' expression
                        oneSpec.append(Constants.PML_STATE_DEFINITION
                                + string.toUpperCase().replace(':', '_'));
                    } else {
                        System.err.println(Constants.ERR_WRONG_SPEC);
                        break;
                    }
                } else {
                    oneSpec.append(string);
                }
            }
            // send string to spin
            oneSpec.insert(0, Constants.SPIN_NOT + Constants.SMBL_LEFT_RBRACE);
            oneSpec.append(Constants.SMBL_RIGHT_RBRACE);
            Runtime rt = Runtime.getRuntime();
            Process proc;
            try {
                // System.out.println("spin.exe -f \"" +
                // oneSpec.toString()+"\"");
                proc = rt.exec(Constants.SPIN_COMMAND_LINE + " \""
                        + oneSpec.toString() + "\"");
                proc.waitFor();
                StringBuilder out = new StringBuilder();
                DataInputStream din = new DataInputStream(proc.getInputStream());
                String temp = "";
                try {
                    while ((temp = din.readLine()) != null) {
                        out.append(temp);
                    }
                    allSpec.add(out.toString());
                } catch (IOException e) {
                    System.exit(0);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return Collections.unmodifiableSet(allSpec);
    }

    /**
     * Promela source code generation
     * 
     * @param automata
     *            - proto-based automata
     */
    public String generate(Automata automata) {
        StringBuilder output = new StringBuilder();
        output.append(Constants.PML_VARS_DEFINITION);
        int index = 0;
        String entryPoint = "";
        // states info defines
        for (String state : automata.states()) {
            state = state.replace(':', '_');
            output.append(Constants.PML_DEFINE + " " + state.toUpperCase()
                    + " " + index + "\n");
            index++;
            if (state.indexOf(Constants.PML_MAIN) != -1) {
                entryPoint = state;
            }
        }
        // main function begins here
        output.append("\n" + Constants.PML_INLINE + " "
                + Constants.SMBL_LEFT_BRACE + "\n");
        // body start
        output.append("\t" + Constants.PML_STATE_ASSIGN + " "
                + entryPoint.replace(':', '_').toUpperCase() + ";");
        output.append("\n\t" + Constants.PML_DO + "\n");
        for (String state : automata.states()) {
            output.append("\t\t" + Constants.SMBL_DOUBLE_COLON + " "
                    + Constants.SMBL_LEFT_RBRACE + " "
                    + Constants.PML_STATE_DEFINITION + " "
                    + state.replace(':', '_').toUpperCase() + " "
                    + Constants.SMBL_RIGHT_RBRACE + " " + Constants.SPIN_IF
                    + "\n");
            if (automata.paths(state) != null) {
                // printf for log
                output.append("\t\t\t" + Constants.PML_PRINTF
                        + Constants.SMBL_LEFT_RBRACE + "\"" + state + "\""
                        + Constants.SMBL_RIGHT_RBRACE + ";\n");
                output.append("\t\t\t" + Constants.PML_IF + "\n");
                for (String path : automata.paths(state)) {
                    output.append("\t\t\t\t" + Constants.SMBL_DOUBLE_COLON
                            + Constants.PML_STATE_ASSIGN
                            + path.replace(':', '_').toUpperCase() + ";\n");
                }
                output.append("\t\t\t" + Constants.PML_FI + "\n");
            } else {
                output.append("\t\t\t" + Constants.PML_PRINTF
                        + Constants.SMBL_LEFT_RBRACE + "\"" + state + "\""
                        + Constants.SMBL_RIGHT_RBRACE + ";\n");
                if (state.indexOf(Constants.PROTO_FINALIZE) != -1) {
                    output.append("\t\t\t" + Constants.PML_BREAK + "\n");
                }
            }
        }
        // body end
        output.append("\t" + Constants.PML_OD + "\n"
                + Constants.SMBL_RIGHT_BRACE + "\n");
        output.append(Constants.PML_PROCTYPE_DEFINITION + " "
                + Constants.SMBL_LEFT_BRACE + "\n");
        output.append("\t" + Constants.PML_A1_CALL + "\n"
                + Constants.SMBL_RIGHT_BRACE + "\n");
        output.append(Constants.PML_INIT + " " + Constants.SMBL_LEFT_BRACE
                + "\n\t" + Constants.PML_RUN_MODEL + "\n"
                + Constants.SMBL_RIGHT_BRACE + "\n");
        // spec time
        Collection<String> ltlSpec = generateSpecs(automata);
        // for each generated specification - create file
        // String defaultFilename =
        // "C://Users//Jill//diploma//proto-code//target//protoOutput";
        int number = 0;
        for (String string : ltlSpec) {
            File promela = new File(Constants.DEFAULT_OUTPUT_FILENAME
                    + (number++) + Constants.PML_FILE_EXTENSION);
            try {
                promela.createNewFile();
                FileWriter fw = new FileWriter(promela);
                fw.write(output.toString() + string);
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (ltlSpec.isEmpty()) {
            File promela = new File(Constants.DEFAULT_OUTPUT_FILENAME
                    + Constants.PML_FILE_EXTENSION);
            try {
                promela.createNewFile();
                FileWriter fw = new FileWriter(promela);
                fw.write(output.toString());
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Constants.MSG_SUCCESS_CREATED_FILES + number;
    }
}