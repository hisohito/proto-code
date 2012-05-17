package proto;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import proto.antlr.grammar.protoLexer;
import proto.antlr.grammar.protoParser;	

public class Launcher {

	public static void main(String[] args) throws IOException, RecognitionException {
		// парсить командную строку
		// создавать инстанс компилятора (+парсер, лексер, генератор)
		// запускать compiler.compile
		// generator.generate

		ANTLRFileStream fs = new ANTLRFileStream("examples/simple.proto");
		protoLexer lexer = new protoLexer(fs);
		TokenRewriteStream tokens = new TokenRewriteStream(lexer);
		protoParser parser = new protoParser(tokens);
		
		System.out.println();

		try {
			parser.program();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
		CommonTree tree = (CommonTree)parser.program().getTree();
	    DOTTreeGenerator gen = new DOTTreeGenerator();
	    StringTemplate st = gen.toDOT(tree);
	    //System.out.println(st);

		//TinyCompiler protoc = new TinyCompiler();

		//System.out.print(protoc.compile());
	}
}
