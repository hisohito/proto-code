package proto.core;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;

public interface Compiler {
	public String compile(ANTLRFileStream fs) throws RecognitionException;
}
