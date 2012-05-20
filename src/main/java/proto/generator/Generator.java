package proto.generator;

import proto.ir.Automata;

public interface Generator {
	public String generate(Automata automata);
}
