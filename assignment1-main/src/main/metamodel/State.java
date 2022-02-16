package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class State {
	
	private String name;
	private Map<String, Transition> transitions;
	
	public State(String name) {
		this.name = name;
		transitions = new HashMap<>();
	}
	
	public void setTransitions(Map<String, Transition> transitions) {
		this.transitions = transitions;
	}

	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return new ArrayList<Transition>(transitions.values());
	}

	public Transition getTransitionByEvent(String string) {
		return transitions.get(string);
	}
	
	public void setTransitions(List<Transition> transitions) {
		transitions.forEach(transition -> {
			this.transitions.put((String) transition.getEvent(), transition);
		});
	}
}
