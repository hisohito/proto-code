package proto.core;

public interface Compiler {
	public Object compile();
}
// на вход AST
// lexer ->parser->generator
// на выходе ir