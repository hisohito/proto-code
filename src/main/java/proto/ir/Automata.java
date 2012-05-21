package proto.ir;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class Automata {
	private Set<String> states;
	private Map<String, Set<String>> paths;
	private Set<String> LTLSpec;
	
	public Automata() {
		states = new HashSet<String>();
		paths = new HashMap<String, Set<String>>();
		LTLSpec = new HashSet<String>();
	}
	
	public void addState(String id) {
		states.add(id);
	}
	
	public boolean hasState(String id) {
		return states.contains(id);
	}
	
	public Collection<String> states() {
		return Collections.unmodifiableSet(states);
	}
	
	public void addPath(String fromId, String toId) {
		Set<String> path = paths.get(fromId);
		if (path == null) {
			path = new HashSet<String>();
			path.add(toId);
			paths.put(fromId, path);
		} else {
			path.add(toId);
		}
	}
	
	public Collection<String> paths(String state) {
		return paths.get(state);
	}
	
	public boolean hasPath(String fromId, String toId) {
		return paths.get(fromId).contains(toId);
	}

	public void addSpec(String id) {
		LTLSpec.add(id);
	}
	
	public Collection<String> specs() {
		return Collections.unmodifiableSet(LTLSpec);
	}
	
	public void print() {
		for (String state : this.states()) {
			System.out.println(state);
			if (this.paths(state) != null) {
				for (String path : this.paths(state)) {
					System.out.println("\t" + path);
				}
			}
		}
	}
}
