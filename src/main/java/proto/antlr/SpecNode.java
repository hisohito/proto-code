package proto.antlr;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class SpecNode extends CommonTree {

	public SpecNode(int ttype) {
		token = new CommonToken(ttype, "");
	}

	public SpecNode(Token t) {
		token = t;
	}

	public String toString() {
		String name = token.getText();
		return (token != null ? name : "");
	}
}
