package proto.generator;

import proto.ir.Automata;

public class PromelaGenerator implements Generator {

	public String generate(Automata automata) {

		StringBuilder output = new StringBuilder();
	
		
		output.append("int stateA1;\nint lastEvent;\n");
		int index = 0;
		String entryPoint = "";
		for (String state : automata.states()) {
			state = state.replace(':', '_');
			output.append("#define " +state.toUpperCase()+ " "+ index+"\n");
			index++;
			if (state.indexOf("main") != -1){
				entryPoint = state;				
			}
		}
		
		output.append("\ninline A1() {\n");
		// body start
		output.append("\tstateA1 = "+entryPoint.replace(':', '_').toUpperCase()+";");
		output.append("\n\tdo\n");
		for (String state : automata.states()) {
			output.append("\t\t:: ( stateA1 == " + state.replace(':', '_').toUpperCase() + " ) ->\n");
			if (automata.paths(state) != null) {
				output.append("\t\t\tprintf(\""+ state +"\");\n");
				output.append("\t\t\tif\n");
				for (String path : automata.paths(state)) {
					output.append("\t\t\t\t::stateA1 = "+path.replace(':', '_').toUpperCase()+";\n");
				}
				output.append("\t\t\tfi;\n");
			} else { 
				output.append("\t\t\tprintf(\""+ state +"\");\n");
			}
		}
		// body end
		output.append("\tod;\n}\n");
		output.append("proctype Model() {\n");
		output.append("\tA1();\n}\n");
		output.append("init {\n\trun Model();\n}");
		
		return output.toString();
	}

}
