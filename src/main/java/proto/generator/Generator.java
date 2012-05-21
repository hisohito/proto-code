package proto.generator;

import java.io.IOException;

import proto.ir.Automata;

public interface Generator {
	public String generate(Automata automata);
}
