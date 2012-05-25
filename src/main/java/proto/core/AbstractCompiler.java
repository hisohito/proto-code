package proto.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import proto.antlr.CallNode;
import proto.antlr.PrototypeNode;
import proto.antlr.StateNode;
import proto.generator.Generator;
import proto.ir.Automata;

public abstract class AbstractCompiler implements Compiler {

	protected CommonTree mainTree;
	protected Generator generator;
	
	public AbstractCompiler(Generator generator) {
		this.generator = generator;
	}

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
						CommonTree parent = (CommonTree) currentNode.getParent();
						String from = parent.toString();
						if (automata.hasState(from)) {
//							System.out.println("[Add path from " + from		+ " to " + current + "]");
							automata.addPath(from, current);
						}
					} else {
						// if it is MethodCall - check if there are StateNodes in his depth
						Collection<String> resolve = resolveCall(tree, current,	automata);
						if (resolve != null) {
							// check all CallNode's in method
							for (String r : resolve) {
								CommonTree fromNode = (CommonTree) currentNode.getParent();
								while (!(fromNode instanceof StateNode)) {
									fromNode = (CommonTree) fromNode.getParent();
								}
								String from = fromNode.toString();
								if (automata.hasState(from)) {
//									System.out.println("[Add path from " + from	+ " to " + r + "]");
									automata.addPath(from, r);
								}
							}
						}
					}
				} else if (currentNode instanceof PrototypeNode){
					formSpec(currentNode, automata);
					break;
				} 
				formPaths((CommonTree) tree.getChild(i), automata);
			}
		}
	}

	private String formSpec (CommonTree tree, Automata automata){
		if (tree != null) {
			String result = "";
			for (int i = 0; i < tree.getChildCount(); i++) {
				CommonTree current = (CommonTree) tree.getChild(i);
				result = current.toString()+" ";
				for (int j = 0; j < current.getChildCount(); j++) {
					result += current.getChild(j).toString() +" ";
					if (current.getChild(j).getChildCount() != 0){
						result = formSpec((CommonTree) current.getChild(j),automata)+" ";
					}
				}
				automata.addSpec(result);
			}
		}
		return "";
	}
	
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
			// 2. if it is CallNode to MethodNode - add to list recursive work result
			// return list
			for (Object child : methodNode.getChildren()) {
				String callName = child.toString();
				if (automata.hasState(callName)) {
					list.add(callName);
				} else {
					List<String> addList = (List<String>) resolveCall(tree,	callName, automata);
					list.addAll(addList);
				}
			}
		}
		return list;
	}
	
	protected Automata compile0(CommonTree tree) {
		mainTree = tree;
		Automata automata = new Automata();
		findStates(tree, automata);
		formPaths(tree, automata);
		automata.print();
		return automata;
	}
}