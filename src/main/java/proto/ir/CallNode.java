package proto.ir;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class CallNode extends CommonTree {

	String classname;
	
	public CallNode(int ttype) {
		token = new CommonToken(ttype, "");
	}

	public CallNode(Token t) {
		token = t;
	}
	
	public CallNode(int ttype, Token t, String cname) {
		token = t;
		this.classname = cname;
	}

	public String toString() {
		return this.classname+"::"+(token!=null?token.getText():"")+"<CallNode>;";
	}
}
