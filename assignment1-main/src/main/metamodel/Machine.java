package main.metamodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Machine {

	private State initialState;
	private Map<String, State> states;
	private Map<String, Integer> variables; //We only have integers so no need to store types.
	
	/*public Machine(State initialState) {
		this.initialState = initialState;
	}*/
	
	public void setInitialState(State state) {
		this.initialState = state;
	}
	
	public List<State> getStates() {
		return new ArrayList<State>(states.values());
	}

	public void addVariable(String variable, int value) {
		variables.put(variable, value);
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
