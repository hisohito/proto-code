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
	
	public Automata() {
		states = new HashSet<String>();
		paths = new HashMap<String, Set<String>>();
	}
	
	public void addState(String id) {
		states.add(id);
	}
	
	public Collection<String> states() {
		return Collections.unmodifiableSet(states);
	}
	
	public Collection<String> paths(String state) {
//		System.out.println("PATHS: "+paths);
		return paths.get(state);
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
	
	public boolean hasPath(String fromId, String toId) {
		return paths.get(fromId).contains(toId);
	}
	
	public boolean hasState(String id) {
		return states.contains(id);
	}

	public String toString() {
		return null;
	}
}
