package proto.antlr;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class StateNode extends CommonTree {

	String classname;

	public StateNode(int ttype) {
		token = new CommonToken(ttype, "");
	}

	public StateNode(Token t) {
		token = t;
	}

	public StateNode(int ttype, Token t, String cname) {
		token = t;
		this.classname = cname;
	}

	public String toString() {
		return classname + "::" + (token != null ? token.getText() : "");
	}
}
