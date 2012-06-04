// **********************************************************************
// Proto Project
// 
// Copyright (c) 2012 Julia Shatilina <julia.shatilina@gmail.com>  
//
// Licensed under the Apache License, Version 2.0 (the "License");
// You may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//      
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// **********************************************************************

package proto;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;

import proto.core.Compiler;
import proto.core.TinyCompiler;
import proto.generator.Generator;
import proto.generator.PromelaGenerator;

public class Launcher {
	
	public static final Map<String, Generator> GENERATORS = new HashMap<String, Generator>() {{
		put("promela", new PromelaGenerator());
	}};

	public void launch(Map<String, String> args) throws IOException, RecognitionException {

		Generator generator = GENERATORS.get(args.get("target"));
		Compiler compiler = new TinyCompiler(generator);

		compiler.compile(new ANTLRFileStream(args.get("source")));
	}

	public static void usage() {
		String usage = "Welcome to Proto Compiler 0.0.1! [http://github.com/hisohito/proto-code]\n\n" +
		"USAGE:\n" +
		"\t java -cp proto-0.0.1.jar proto.Launcher [--target=<TARGET>] [--output=<OUTPUT_FILE>] <SOURCE>\n\n" +
		"\t <SOURCE> is an proto source file\n" +
		"\t <TARGET> is one of supported targets (promela by default)\n" +
		"\t <OUTPUT_FILE> is an output file name (out.pml by default)\n";
		
		System.out.println(usage);
	}

	public static void main(String[] args) throws IOException, RecognitionException {
		
		Map<String, String> yeld = new HashMap<String, String>();
		for(String arg: args) {
			if (arg.matches("--\\w+=\\w+")) {
				arg = arg.substring(2);
				String[] parts = arg.split("=");
				yeld.put(parts[0], parts[1]);
			} else {
				yeld.put("source", arg);
			}
		}
		
		if (yeld.get("source") == null) {
			usage();
			return;
		}
		
		if (yeld.get("output") == null) yeld.put("output", "out.pml");
		if (yeld.get("target") == null) yeld.put("target", "promela");
		
		new Launcher().launch(yeld);
	}
}
