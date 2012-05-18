package proto.core;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;

public interface Compiler {
	public Object compile(ANTLRFileStream fs) throws RecognitionException;
}
// на вход AST
// lexer ->parser->generator
// на выходе ir