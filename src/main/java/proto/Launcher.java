package proto;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;

import proto.core.Compiler;
import proto.core.TinyCompiler;

public class Launcher {

	public void launch(Map<String, String> args) throws IOException, RecognitionException {

		ANTLRFileStream fs = new ANTLRFileStream("examples/simple.proto");
		
		Compiler compiler = new TinyCompiler();
		String output = "";
		output = compiler.compile(fs);
		
		System.err.println(output);
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
		
		new Launcher().launch(yeld);
	}
}
