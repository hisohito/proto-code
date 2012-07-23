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

import java.util.*;

import org.antlr.runtime.tree.*;

import proto.antlr.*;
import proto.generator.*;
import proto.ir.*;

public abstract class AbstractCompiler implements Compiler {

    protected CommonTree mainTree;
    protected Generator generator;

    /**
     * 
     * @param generator
     */
    public AbstractCompiler(Generator generator) {
        this.generator = generator;
    }

    /**
     * 
     * @param tree
     * @param automata
     */
    private void findStates(CommonTree tree, Automata automata) {
        if (tree != null) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                CommonTree current = (CommonTree) tree.getChild(i);
                if (current instanceof StateNode) {
                    automata.addState(current.toString());
                }
                findStates((CommonTree) tree.getChild(i), automata);
            }
        }
    }

    /**
     * 
     * @param tree
     * @param name
     * @return
     */
    private CommonTree getSubTree(CommonTree tree, String name) {
        if (tree != null) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                String current = tree.getChild(i).toString();
                if (current.equals(name)) {
                    return (CommonTree) tree.getChild(i);
                }
                CommonTree t = getSubTree((CommonTree) tree.getChild(i), name);
                if (t != null)
                    return t;
            }
            return null;
        }
        return null;
    }

    /**
     * 
     * @param tree
     * @param automata
     */
    private void formPaths(CommonTree tree, Automata automata) {
        if (tree != null) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                CommonTree currentNode = (CommonTree) tree.getChild(i);
                String current = currentNode.toString();

                if (currentNode instanceof CallNode) {
                    if (!(currentNode.getParent() instanceof StateNode))
                        continue;

                    if (automata.hasState(current)) {
                        // this is call if StateNode -> ad path to automata
                        CommonTree parent = (CommonTree) currentNode
                                .getParent();
                        String from = parent.toString();
                        if (automata.hasState(from)) {
                            // System.out.println("[Add path from " + from +
                            // " to " + current + "]");
                            automata.addPath(from, current);
                        }
                    } else {
                        // if it is MethodCall - check if there are StateNodes
                        // in his depth
                        Collection<String> resolve = resolveCall(tree, current,
                                automata);
                        if (resolve != null) {
                            // check all CallNode's in method
                            for (String r : resolve) {
                                CommonTree fromNode = (CommonTree) currentNode
                                        .getParent();
                                while (!(fromNode instanceof StateNode)) {
                                    fromNode = (CommonTree) fromNode
                                            .getParent();
                                }
                                String from = fromNode.toString();
                                if (automata.hasState(from)) {
                                    // System.out.println("[Add path from " +
                                    // from + " to " + r + "]");
                                    automata.addPath(from, r);
                                }
                            }
                        }
                    }
                } else if (currentNode instanceof PrototypeNode) {
                    formSpec(currentNode, automata);
                    break;
                }
                formPaths((CommonTree) tree.getChild(i), automata);
            }
        }
    }

    /**
     * 
     * @param tree
     * @param automata
     * @return
     */
    private String formSpec(CommonTree tree, Automata automata) {
        if (tree != null) {
            String result = "";
            for (int i = 0; i < tree.getChildCount(); i++) {
                CommonTree current = (CommonTree) tree.getChild(i);
                result = current.toString() + " ";
                for (int j = 0; j < current.getChildCount(); j++) {
                    result += current.getChild(j).toString() + " ";
                    if (current.getChild(j).getChildCount() != 0) {
                        result = formSpec((CommonTree) current.getChild(j),
                                automata) + " ";
                    }
                }
                automata.addSpec(result);
            }
        }
        return "";
    }

    /**
     * 
     * @param tree
     * @param id
     * @param automata
     * @return
     */
    private Collection<String> resolveCall(CommonTree tree, String id,
            Automata automata) {
        List<String> list = new ArrayList<String>();
        // find exactly this MethodNode in tree
        CommonTree methodNode = this.getSubTree(this.mainTree, id);

        // if there is no childs - :`-(
        if (methodNode == null || methodNode.getChildCount() == 0) {
            return null;
        } else {
            // for all node childs:
            // 1. if it is CallNode to StateNode - add to list
            // 2. if it is CallNode to MethodNode - add to list recursive work
            // result
            // return list
            for (Object child : methodNode.getChildren()) {
                String callName = child.toString();
                if (automata.hasState(callName)) {
                    list.add(callName);
                } else {
                    List<String> addList = (List<String>) resolveCall(tree,
                            callName, automata);
                    list.addAll(addList);
                }
            }
        }
        return list;
    }

    /**
     * 
     * @param tree
     * @return
     */
    protected Automata compile0(CommonTree tree) {
        mainTree = tree;
        Automata automata = new Automata();
        findStates(tree, automata);
        formPaths(tree, automata);
        // automata.print();
        return automata;
    }
}