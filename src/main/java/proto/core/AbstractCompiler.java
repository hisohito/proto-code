package proto.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import proto.antlr.CallNode;
import proto.antlr.StateNode;
import proto.ir.Automata;

public abstract class AbstractCompiler implements Compiler {

	CommonTree mainTree;

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
						// это вызов узла состояния -> делаем переход
						CommonTree parent = (CommonTree) currentNode.getParent();
						String from = parent.toString();
						if (automata.hasState(from)) {
//							System.out.println("[Add path from " + from		+ " to " + current + "]");
							automata.addPath(from, current);
						}
					} else {
						// это левый вызов - приводит ли он к состоянию?
						// найти узел "метод" с таким же именем и классом
						Collection<String> resolve = resolveCall(tree, current,	automata);
						if (resolve != null) {
							// в методе просмотреть все <call>
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
						} // если нет их - он нам не интересен
					}
				}
				formPaths((CommonTree) tree.getChild(i), automata);
			}
		}
	}

	private Collection<String> resolveCall(CommonTree tree, String id,
			Automata automata) {
		// создать пустой список
		List<String> list = new ArrayList<String>();
		// находим соотв метод нод
		CommonTree methodNode;
		methodNode = this.getSubTree(this.mainTree, id);

		// если детей нет - вернем нул
		if (methodNode == null || methodNode.getChildCount() == 0) {
			return null;
		} else {
			// для всех детей метод нода:
			// 1. если кол в состояние - добавить в список
			// 2. если кол в простой метод - добавить в список то что вернет
			// запускаемый рекурсивно вызов resolveCall
			// вернуть список
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
//		automata.print();
		return automata;
	}
}