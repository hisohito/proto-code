package proto.antlr;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class PrototypeNode extends CommonTree {
	String classname;

	public PrototypeNode(int ttype) {
		token = new CommonToken(ttype, "");
	}

	public PrototypeNode(Token t) {
		token = t;
	}

	public PrototypeNode(int ttype, Token t, String cname) {
		token = t;
		this.classname = cname;
	}

	public String toString() {
		String name = token.getText();
		return this.classname + "::" + (token != null ? name : "");
	}
}
