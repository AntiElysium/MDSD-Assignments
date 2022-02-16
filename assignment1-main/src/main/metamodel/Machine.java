package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {

	private State initialState;
	private Map<String, State> states;
	private Map<String, Integer> variables; //We only have integers so no need to store types.

	public Machine() {
		states = new HashMap<>();
		variables = new HashMap<>();
	}
	
	public void setInitialState(State state) {
		this.initialState = state;
	}
	
	public void setStates(Map<String, State> states) {
		this.states = states;
	}
	
	public List<State> getStates() {
		return new ArrayList<State>(states.values());
	}

	public void addVariable(String variable, int value) {
		variables.put(variable, value);
	}
	
	public void incrementVariable(String variable) {
		variables.replace(variable, variables.get(variable)+1);
	}
	
	public void decrementVariable(String variable) {
		variables.replace(variable, variables.get(variable)-1);
	}
	
	public int getVariable(String variable) {
		return variables.get(variable);
	}
	
	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
		return states.get(string);
	}

	public int numberOfIntegers() {
		return variables.size();
	}

	public boolean hasInteger(String string) {
		return variables.get(string) != null;
	}
}
