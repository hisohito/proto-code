package proto.core;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;

import proto.antlr.ProtoLexer;
import proto.antlr.ProtoParser;
import proto.generator.Generator;
import proto.generator.PromelaGenerator;
import proto.ir.Automata;

public class TinyCompiler extends AbstractCompiler implements Compiler {

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

	public String compile(ANTLRFileStream fs) throws RecognitionException {

		ProtoParser parser = new ProtoParser(new TokenRewriteStream(new ProtoLexer(fs)));
		CommonTree tree = (CommonTree) parser.program().getTree();
		printTree(tree, 0);
		Automata ir = compile0(tree);

		Generator generator = new PromelaGenerator();
		return generator.generate(ir);
	}
}
