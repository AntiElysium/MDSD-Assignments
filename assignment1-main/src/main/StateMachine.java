package main;

import java.util.List;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	
	private Map<String, Transition> transitions;
	private String eventName, variableName, targetStateName, equalsConditionName, greaterConditionName, lessConditionName, incrementName, decrementName;
	private int variableValue, equalsConditionValue, greaterConditionValue, lessConditionValue;
	private Machine metamodel = new Machine();
	private Map<String,State> states;
	private String currentTransition;
	
	public Machine build() {
		//Take lists of states and transitions and give to a new machine object and return it?
		return metamodel;
	}

	public StateMachine state(String string) {
		states.put(string, new State(string));
		return this;
	}

	public StateMachine initial() {
		return this;
	}

	public StateMachine when(String string) {
		/*if(eventName != null) {
			Transition transition = new Transition();
		}*/
		Transition trans = new Transition();
		trans.setEvent(string);
		transitions.put(string,trans);
		currentTransition = string;
		return this;
	}

	public StateMachine to(String string) {
		//targetStateName = string;
		if (states.get(string) == null) states.put(string, new State(string));
		transitions.get(currentTransition).setTarget(states.get(string));
		return this;
	}

	public StateMachine integer(String string) {
		return this;
	}

	public StateMachine set(String string, int i) {
		//variableName = string;
		//variableValue = i;
		transitions.get(currentTransition).setOperationVariables(string, i);
		return this;
	}

	public StateMachine increment(String string) {
		incrementName = string;
		return this;
	}

	public StateMachine decrement(String string) {
		decrementName = string;
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		//equalsConditionName = string;
		//equalsConditionValue = i;
		Transition curr = transitions.get(currentTransition);
		curr.setConditionVariableName(string);
		curr.setConditionComparedValue(i);
		curr.setConditionEqual(true);
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		greaterConditionName = string;
		greaterConditionValue = i;
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		lessConditionName = string;
		lessConditionValue = i;
		return this;
	}

}
