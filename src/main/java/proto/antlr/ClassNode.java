package proto.antlr;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class ClassNode extends CommonTree {
	
	public ClassNode(int ttype) {
		token = new CommonToken(ttype, "");
	}

	public ClassNode(Token t) {
		token = t;
	}

	public String toString() {
		return (token!=null?token.getText():"")+"<ClassNode>;";
	}
}
