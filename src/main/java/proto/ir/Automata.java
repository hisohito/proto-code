// **********************************************************************
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

package proto.ir;

import java.util.*;

public final class Automata {

    private Set<String> states;
    private Map<String, Set<String>> paths;
    private Set<String> LTLSpec;

    public Automata() {
        states = new HashSet<String>();
        paths = new HashMap<String, Set<String>>();
        LTLSpec = new HashSet<String>();
    }

    /**
     * 
     * @param id
     */
    public void addState(String id) {
        states.add(id);
    }

    /**
     * Check if state with te id specified exist in automata
     * @param id
     * @return boolean
     */
    public boolean hasState(String id) {
        return states.contains(id);
    }

    /**
     * Return all states
     * @return Collection<String>
     */
    public Collection<String> states() {
        return Collections.unmodifiableSet(states);
    }

    /**
     * Add path between two states
     * @param fromId
     * @param toId
     */
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

    /**
     * Get all states for specified state id
     * @param state
     * @return
     */
    public Collection<String> paths(String state) {
        return paths.get(state);
    }

    /**
     * Check if path exist
     * @param fromId
     * @param toId
     * @return
     */
    public boolean hasPath(String fromId, String toId) {
        return paths.get(fromId).contains(toId);
    }

    /**
     * Add specification node
     * @param id
     */
    public void addSpec(String id) {
        LTLSpec.add(id);
    }

    /**
     * Return all specifications of automata
     * @return Collection<String>
     */
    public Collection<String> specs() {
        return Collections.unmodifiableSet(LTLSpec);
    }

    /**
     * Print automata
     */
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