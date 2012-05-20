package proto.antlr;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class MethodNode extends CommonTree {

	String classname;

	public MethodNode(int ttype) {
		token = new CommonToken(ttype, "");
	}

	public MethodNode(Token t) {
		token = t;
	}

	public MethodNode(int ttype, Token t, String cname) {
		token = t;
		this.classname = cname;
	}

	public String toString() {
		return this.classname + "::" + (token != null ? token.getText() : "");
	}
}
