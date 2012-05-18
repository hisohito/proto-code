package proto.core;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;

import proto.antlr.ProtoLexer;
import proto.antlr.ProtoParser;

public class TinyCompiler implements Compiler {

	public static void printTree(CommonTree t, int indent) {
		if (t != null) {
			StringBuffer sb = new StringBuffer(indent);

			if (t.getParent() == null) {
				System.out.println(sb.toString() + t.getText());
			}
			for (int i = 0; i < indent; i++)
				sb = sb.append("   ");
			for (int i = 0; i < t.getChildCount(); i++) {
				System.out.println(sb.toString() + t.getChild(i));
				printTree((CommonTree) t.getChild(i), indent + 1);
			}
		}
	}

	public Object compile(ANTLRFileStream fs) throws RecognitionException {

		// TODO Auto-generated method stub
		ProtoLexer lexer = new ProtoLexer(fs);
		TokenRewriteStream tokens = new TokenRewriteStream(lexer);
		ProtoParser parser = new ProtoParser(tokens);
		ProtoParser.program_return ret = parser.program();
		CommonTree tree = (CommonTree) ret.getTree();
		printTree(tree, 0);

		// try {
		// parser.program();
		// } catch (Exception e) {
		// System.out.println("Error: " + e);
		// }
		//

		// System.err.println(tree.toStringTree());

		// DOTTreeGenerator gen = new DOTTreeGenerator();
		// StringTemplate st = gen.toDOT(tree);
		// System.out.println(st);

		return null;
	}
}
