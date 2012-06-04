// **********************************************************************
// Proto Project
// 
// Copyright (c) 2012 Julia Shatilina <julia.shatilina@gmail.com>  
//
// Licensed under the Apache License, Version 2.0 (the "License");
// You may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//      
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// **********************************************************************

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
		return (token != null ? token.getText() : "");
	}
}
