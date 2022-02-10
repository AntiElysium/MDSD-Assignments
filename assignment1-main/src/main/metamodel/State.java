package main.metamodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class State {
	
	private String name;
	private Map<String, Transition> transitions;
	
	//Add way to add transitions either through constructor or adder
	
	public State(String name) {
		this.name = name;
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

}
