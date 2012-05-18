package proto;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import proto.antlr.ProtoLexer;
import proto.antlr.ProtoParser;

public class Launcher {

	public static void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			
			if (t.getParent() == null){
				System.out.println(sb.toString() + t.getText());	
			}
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i));
				printTree((CommonTree)t.getChild(i), indent + 1);
			}
		}
	}
	
	public static void main(String[] args) throws IOException, RecognitionException {
		// парсить командную строку
		// создавать инстанс компилятора (+парсер, лексер, генератор)
		// запускать compiler.compile
		// generator.generate

		ANTLRFileStream fs = new ANTLRFileStream("examples/simple.proto");
		ProtoLexer lexer = new ProtoLexer(fs);
		TokenRewriteStream tokens = new TokenRewriteStream(lexer);
		ProtoParser parser = new ProtoParser(tokens);
		
		System.out.println();

//		try {
//			parser.program();
//		} catch (Exception e) {
//			System.out.println("Error: " + e);
//		}
//		
		ProtoParser.program_return ret = parser.program();
		CommonTree tree = (CommonTree)ret.getTree();
		//System.out.println(tree);
		printTree(tree, 0);
		
		//System.err.println(tree.toStringTree());
		
	    DOTTreeGenerator gen = new DOTTreeGenerator();
	    StringTemplate st = gen.toDOT(tree);
	    System.out.println(st);

		//TinyCompiler protoc = new TinyCompiler();

		//System.out.print(protoc.compile());
	}
}
