package proto.generator;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import proto.ir.Automata;

public class PromelaGenerator implements Generator {

	private Collection<String> generateSpecs(Automata automata) {

		Set<String> allSpec = new HashSet<String>();
		
		Collection<String> specs = automata.specs();

		for (String spec : specs) {
			// replace words
			spec = spec.replaceAll("finally", "<>")
					.replaceAll("globally", "[]").replaceAll("until", "U")
					.replaceAll("release", "R");
			spec = spec.replaceAll("not", "!").replaceAll("and", "&&")
					.replaceAll("or", "||").replaceAll("if", "->");

			String tmp[] = spec.split(" ");
			StringBuilder oneSpec = new StringBuilder();
			for (String string : tmp) {
				if (!string.equals("R") && !string.equals("->")
						&& !string.equals("||") && !string.equals("&&")
						&& !string.equals("U") && !string.equals("!")
						&& !string.equals("{") && !string.equals("}")
						&& !string.equals("(") && !string.equals(")")
						&& !string.equalsIgnoreCase("[]")
						&& !string.equalsIgnoreCase("<>")) {
					if (automata.hasState(string)) {
						// insert state 'stateA1' expression
						oneSpec.append("stateA1 == "+ string.toUpperCase().replace(':', '_'));
					} else {
						System.err.println("ERROR: Wrong specification description!");
						break;
					}
				} else {
					oneSpec.append(string);
				}
			}
			// send string to spin
			oneSpec.insert(0, "!(");
			oneSpec.append(")");
			System.out.println("Get spec: " + oneSpec.toString());

			Runtime rt = Runtime.getRuntime();
			Process proc;
			try {
				proc = rt.exec("spin.exe -f \"" + oneSpec.toString()+"\"");
				int exitVal = proc.waitFor();

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Collections.unmodifiableSet(allSpec);
	}

	public String generate(Automata automata) {

		StringBuilder output = new StringBuilder();

		output.append("int stateA1;\nint lastEvent;\n");
		int index = 0;
		String entryPoint = "";
		// states info defines
		for (String state : automata.states()) {
			state = state.replace(':', '_');
			output.append("#define " + state.toUpperCase() + " " + index + "\n");
			index++;
			if (state.indexOf("main") != -1) {
				entryPoint = state;
			}
		}
		// main function begins here
		output.append("\ninline A1() {\n");
		// body start
		output.append("\tstateA1 = "+ entryPoint.replace(':', '_').toUpperCase() + ";");
		output.append("\n\tdo\n");
		for (String state : automata.states()) {
			output.append("\t\t:: ( stateA1 == "+ state.replace(':', '_').toUpperCase() + " ) ->\n");
			if (automata.paths(state) != null) {
				// printf for log
				output.append("\t\t\tprintf(\"" + state + "\");\n");
				output.append("\t\t\tif\n");
				for (String path : automata.paths(state)) {
					output.append("\t\t\t\t::stateA1 = "+ path.replace(':', '_').toUpperCase() + ";\n");
				}
				output.append("\t\t\tfi;\n");
			} else {
				output.append("\t\t\tprintf(\"" + state + "\");\n");
			}
		}
		// body end
		output.append("\tod;\n}\n");
		output.append("proctype Model() {\n");
		output.append("\tA1();\n}\n");
		output.append("init {\n\trun Model();\n}\n");

		// spec time
		Collection<String> ltlSpec = generateSpecs(automata);
		// for each generated specification - create file
		String defaultFilename = "C://Users//Jill//diploma//proto-code//target//protoOutput";
		int number = 0;
		for (String string : ltlSpec) {
			File promela = new File(defaultFilename+(number++)+".pml");
			try {
				promela.createNewFile();
				
				FileWriter fw = new FileWriter(promela);
				
				fw.write(output.toString()+string);
				
				fw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return "Success created "+number+" files";
	}

}
