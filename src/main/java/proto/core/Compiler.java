package proto.core;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;

public interface Compiler {
	public Object compile(ANTLRFileStream fs) throws RecognitionException;
}
// �� ���� AST
// lexer ->parser->generator
// �� ������ ir