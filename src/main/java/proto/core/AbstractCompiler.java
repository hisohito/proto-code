package proto.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import proto.antlr.StateNode;
import proto.ir.Automata;

public abstract class AbstractCompiler implements Compiler {
	
	CommonTree mainTree;

	private void findStates(CommonTree tree, Automata automata) {
		if (tree != null) {
			for (int i = 0; i < tree.getChildCount(); i++) {
				String current = tree.getChild(i).toString();
				if (current.indexOf("<StateNode>") != -1) {
					automata.addState(current.substring(0,	current.indexOf("<StateNode>")));
					System.out.println(current.substring(0,	current.indexOf("<StateNode>")));
				}
				findStates((CommonTree) tree.getChild(i), automata);
			}
		}
	}
	
	private CommonTree getSubTree(CommonTree tree, String name) {
		System.out.println("GETSUBTREE FOR "+name);
		if (tree != null) {
			for (int i = 0; i < tree.getChildCount(); i++) {
				String current = tree.getChild(i).toString();
				System.out.println(current+" == "+ name);
				if (current.equals(name)) {
					System.out.println("------FIND!!!");
					return (CommonTree) tree.getChild(i);
				}
				CommonTree t = getSubTree((CommonTree)tree.getChild(i), name);
				if (t != null) return t;
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
				
				System.out.println("Current node: "+current);
				
				if (current.indexOf("<CallNode>") != -1) {
					if (!(currentNode.getParent() instanceof StateNode)) continue;
					System.out.println("Find <CallNode>: "+current);
					if ( automata.hasState(current.substring(0,	current.indexOf("<CallNode>")))){
						// это вызов узла состояния -> делаем переход
						CommonTree parent = (CommonTree) currentNode.getParent();
						String from = parent.toString().substring(0, parent.toString().indexOf("<")) ;
						if (automata.hasState(from)){
							String to = current.substring(0, current.indexOf("<CallNode>"));
							System.out.println("Automata has state "+to);
							System.out.println("[Add path from "+from+" to "+ to +"]");
							automata.addPath(from, to);
						}
					} else {
						System.out.println("Find <CallNode> NOT STATE: "+current);
						// это левый вызов - приводит ли он к состоянию?
						// найти узел "метод" с таким же именем и классом
						Collection<String> resolve = resolveCall(tree, current, automata);
						System.out.println("RESOLVE: "+resolve);
						if (resolve != null){
							// в методе просмотреть все <call>
							for (String r : resolve) {
								CommonTree fromNode = (CommonTree) currentNode.getParent();
								while (!(fromNode instanceof StateNode )){
									fromNode = (CommonTree) fromNode.getParent();
								}
								String from = fromNode.toString().substring(0,fromNode.toString().indexOf("<"));
								System.out.println("from "+from);
								if (automata.hasState(from)){
									System.out.println("[Add path from "+from+" to "+r+"]");
									automata.addPath(from, r);
								}
							}
						} 	// если нет их - он нам не интересен
					}
				}
				formPaths((CommonTree) tree.getChild(i), automata);
			}
		}
	}

	private Collection<String> resolveCall(CommonTree tree, String id, Automata automata) {
		// создать пустой список
		List<String> list = new ArrayList<String>();
		// находим соотв метод нод
		CommonTree methodNode;
		if (id.indexOf("<")!=-1){
			methodNode = this.getSubTree(this.mainTree, id.substring(0, id.indexOf("<"))+"<MethodNode>;");
		} else {
			methodNode = this.getSubTree(this.mainTree, id + "<MethodNode>;");
		}
		System.out.println("methodNode in tree: "+methodNode);
		
		// если детей нет - вернем нул
		if (methodNode == null || methodNode.getChildCount() == 0){
			return null;
		} else {
			// для всех детей метод нода: 
			// 				1. если кол в состояние - добавить в список
			//				2. если кол в простой метод - добавить в список то что вернет запускаемый рекурсивно вызов resolveCall
			// 	вернуть список
			for ( Object child : methodNode.getChildren()) {
				String callName = child.toString().subSequence(0, child.toString().indexOf("<CallNode>")).toString();
				System.out.println("Check callNode "+ callName);
				if ( automata.hasState(callName)){
					System.out.println("Add "+callName);
					list.add(callName);
				} else {
					List<String> addList = (List<String>) resolveCall(tree, callName, automata);
					list.addAll(addList);
				}
			}
		}
		return list;
	}
	
	protected Automata compile0(CommonTree tree) {

		mainTree = tree;
		
		Automata automata = new Automata();
		System.out.println("------States-------");
		findStates(tree, automata);
		System.out.println("-------------------");
		System.out.println("Form Paths started...");
		formPaths(tree, automata);
		
		for (String state : automata.states()) {
			System.out.println(state);
			if (automata.paths(state)!= null){
				for (String path : automata.paths(state)) {
					System.out.println("\t"+path);				
				}
			}
		}
		
		return null;
	}
}
