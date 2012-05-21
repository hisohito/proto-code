package proto.generator;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Collection;

import proto.ir.Automata;

public class PromelaGenerator implements Generator {

	private String generateSpecs(Automata automata) {

		StringBuilder specbuilder = new StringBuilder();

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
						oneSpec.append("stateA1 == "
								+ string.toUpperCase().replace(':', '_'));
					} else {
						System.err
								.println("ERROR: Wrong specification description!");
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

				DataInputStream ls_in = new DataInputStream(proc.getInputStream());
				String temp = "";
				try {
					while ((temp = ls_in.readLine()) != null) {
						System.out.println(temp);
					}
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

			specbuilder.append("\n");
		}

		return specbuilder.toString();
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
		output.append("\tstateA1 = "
				+ entryPoint.replace(':', '_').toUpperCase() + ";");
		output.append("\n\tdo\n");
		for (String state : automata.states()) {
			output.append("\t\t:: ( stateA1 == "
					+ state.replace(':', '_').toUpperCase() + " ) ->\n");
			if (automata.paths(state) != null) {
				// printf for log
				output.append("\t\t\tprintf(\"" + state + "\");\n");
				output.append("\t\t\tif\n");
				for (String path : automata.paths(state)) {
					output.append("\t\t\t\t::stateA1 = "
							+ path.replace(':', '_').toUpperCase() + ";\n");
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
		output.append(generateSpecs(automata));

		return output.toString();
	}

}
