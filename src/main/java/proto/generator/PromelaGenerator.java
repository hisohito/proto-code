package proto.generator;

import proto.ir.Automata;

public class PromelaGenerator implements Generator {

	public String generate(Automata automata) {

		String output = "int stateA1;\nint lastEvent;\n";
		int index = 0;
		String entryPoint = "";
		for (String state : automata.states()) {
			state = state.replace(':', '_');
			output+= "#define " +state.toUpperCase()+ " "+ index+"\n";
			index++;
			if (state.indexOf("main") != -1){
				entryPoint = state;				
			}
		}
		
		output += "\ninline A1() {\n";
		// body start
		output += "\tstateA1 = "+entryPoint.replace(':', '_').toUpperCase()+";";
		output += "\n\tdo\n";
		for (String state : automata.states()) {
			output += "\t\t:: ( stateA1 == " + state.replace(':', '_').toUpperCase() + " ) ->\n";
			if (automata.paths(state) != null) {
				output += "\t\t\tprintf(\""+ state +"\");\n";
				output += "\t\t\tif\n";
				for (String path : automata.paths(state)) {
					output += "\t\t\t\t::stateA1 = "+path.replace(':', '_').toUpperCase()+";\n";
				}
				output += "\t\t\tfi;\n";
			} else { 
				output+="\t\t\tprintf(\""+ state +"\");\n";
			}
		}
		// body end
		output += "\tod;\n}\n";
		output += "proctype Model() {\n";
		output += "\tA1();\n}\n";
		output += "init {\n\trun Model();\n}";
		
		return output;
	}

}
