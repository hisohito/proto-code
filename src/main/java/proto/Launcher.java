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

package proto;

import java.io.*;
import java.util.*;

import org.antlr.runtime.*;

import proto.constants.*;
import proto.core.*;
import proto.core.Compiler;
import proto.generator.*;

public class Launcher {

    public static final Map<String, Generator> GENERATORS = new HashMap<String, Generator>() {
        {
            put(Constants.LANGUAGE_PROMELA, new PromelaGenerator());
        }
    };

    /**
     * 
     * @param args
     * @throws IOException
     * @throws RecognitionException
     */
    public void launch(Map<String, String> args) throws IOException,
            RecognitionException {
        Generator generator = GENERATORS.get(args
                .get(Constants.PARAMETERS_TARGET));
        Compiler compiler = new TinyCompiler(generator);
        compiler.compile(new ANTLRFileStream(args
                .get(Constants.PARAMETERS_SOURCE)));
    }

    /**
     * 
     */
    public static void usage() {
        String usage = Constants.USAGE;
        System.out.println(usage);
    }

    /**
     * 
     * @param args
     * @throws IOException
     * @throws RecognitionException
     */
    public static void main(String[] args) throws IOException,
            RecognitionException {
        Map<String, String> yeld = new HashMap<String, String>();
        for (String arg : args) {
            if (arg.matches("--\\w+=\\w+")) {
                arg = arg.substring(2);
                String[] parts = arg.split("=");
                yeld.put(parts[0], parts[1]);
            } else {
                yeld.put(Constants.PARAMETERS_SOURCE, arg);
            }
        }
        if (yeld.get(Constants.PARAMETERS_SOURCE) == null) {
            usage();
            return;
        }
        if (yeld.get(Constants.PARAMETERS_OUTPUT) == null)
            yeld.put(Constants.PARAMETERS_OUTPUT,
                    Constants.DEFAULT_OUTPUT_FILENAME);
        if (yeld.get(Constants.PARAMETERS_TARGET) == null)
            yeld.put(Constants.PARAMETERS_TARGET, Constants.LANGUAGE_PROMELA);
        new Launcher().launch(yeld);
    }
}