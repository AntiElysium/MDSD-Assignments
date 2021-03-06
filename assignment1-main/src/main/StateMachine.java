package main;

import java.util.HashMap;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	
	private Map<String, Transition> transitions;
	private Machine metamodel = new Machine();
	private Map<String,State> states;
	private String currentTransition;
	private String currStateEvent;
	
	public StateMachine() {
		states = new HashMap<>();
		transitions = new HashMap<>();
	}
	
	public Machine build() {
		metamodel.setStates(states);
		return metamodel;
	}

	public StateMachine state(String string) {
		if(currStateEvent != null) {
			states.get(currStateEvent).setTransitions(transitions);
			transitions = new HashMap<>();			
		}
		if(states.get(string) == null) {
			states.put(string, new State(string));			
		}
		currStateEvent = string;
		return this;
	}

	public StateMachine initial() {
		metamodel.setInitialState(states.get(currStateEvent));
		return this;
	}

	public StateMachine when(String string) {
		if(transitions.containsKey(string) ) {
			return this;
		}
		Transition trans = new Transition();
		trans.setEvent(string);
		transitions.put(string,trans);
		System.out.println("Transitions "+ transitions);
		currentTransition = string;
		return this;
	}

	public StateMachine to(String string) {
		if (states.get(string) == null) states.put(string, new State(string));
		transitions.get(currentTransition).setTarget(states.get(string));
		return this;
	}

	public StateMachine integer(String string) {
		metamodel.addVariable(string, 0);
		return this;
	}

	public StateMachine set(String string, int i) {
		Transition currTran = transitions.get(currentTransition);
		currTran.setOperationVariables(string, i);
		currTran.setSetOperation(true);
		return this;
	}

	public StateMachine increment(String string) {
		Transition currTran = transitions.get(currentTransition);
		if(!currTran.hasDecrementOperation()) {
			currTran.setOperationVariableName(string);
			currTran.setIncrementOperation(true);
			currTran.setOperation(true);			
		}
		return this;
	}

	public StateMachine decrement(String string) {
		Transition currTran = transitions.get(currentTransition);
		if(!currTran.hasIncrementOperation()) {
			currTran.setOperationVariableName(string);
			currTran.setDecrementOperation(true);
			currTran.setOperation(true);			
		}
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		Transition currTran = transitions.get(currentTransition);
		currTran.setConditionVariableName(string);
		currTran.setConditionComparedValue(i);
		currTran.setConditionEqual(true);
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		Transition currTran = transitions.get(currentTransition);
		currTran.setConditionVariableName(string);
		currTran.setConditionComparedValue(i);
		currTran.setConditionGreaterThan(true);
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		Transition currTran = transitions.get(currentTransition);
		currTran.setConditionVariableName(string);
		currTran.setConditionComparedValue(i);
		currTran.setConditionLessThan(true);
		return this;
	}
}
