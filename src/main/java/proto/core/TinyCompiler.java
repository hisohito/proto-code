// **********************************************************************
// Proto Project
//
// Copyright (c) 2012 Julia Shatilina <julia.shatilina@gmail.com>
//
// Licensed under the Apache License, Version 2.0 (the "License");
// You may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// **********************************************************************

package proto.core;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import proto.antlr.*;
import proto.generator.*;
import proto.ir.*;

public class TinyCompiler extends AbstractCompiler implements Compiler {

    public TinyCompiler(Generator generator) {
        super(generator);
    }

    public static void printTree(CommonTree t, int indent) {
        if (t != null) {
            StringBuffer sb = new StringBuffer(indent);

            if (t.getParent() == null) {
                System.out.println(sb.toString() + t.getText());
            }
            for (int i = 0; i < indent; i++)
                sb = sb.append("\t");
            for (int i = 0; i < t.getChildCount(); i++) {
                System.out.println(sb.toString() + t.getChild(i));
                printTree((CommonTree) t.getChild(i), indent + 1);
            }
        }
    }

    public String compile(ANTLRFileStream fs) throws RecognitionException {
        ProtoParser parser = new ProtoParser(new TokenRewriteStream(
                new ProtoLexer(fs)));
        CommonTree tree = (CommonTree) parser.program().getTree();
        // printTree(tree, 0);
        Automata ir = compile0(tree);
        return generator.generate(ir);
    }
}
