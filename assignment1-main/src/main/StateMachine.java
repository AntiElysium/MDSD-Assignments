package main;

import java.util.Map;
import main.metamodel.Machine;
import main.metamodel.Transition;

public class StateMachine {
	
	private Map<String, Transition> transitions;
	private String eventName, variableName, targetStateName, equalsConditionName, greaterConditionName, lessConditionName, incrementName, decrementName;
	private int variableValue, equalsConditionValue, greaterConditionValue, lessConditionValue;
	
	public Machine build() {
		//Take lists of states and transitions and give to a new machine object and return it?
		return null;
	}

	public StateMachine state(String string) {
		return this;
	}

	public StateMachine initial() {
		return this;
	}

	public StateMachine when(String string) {
		if(eventName != null) {
			Transition transition = new Transition();
		}
		return this;
	}

	public StateMachine to(String string) {
		targetStateName = string;
		return this;
	}

	public StateMachine integer(String string) {
		return this;
	}

	public StateMachine set(String string, int i) {
		variableName = string;
		variableValue = i;
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
		equalsConditionName = string;
		equalsConditionValue = i;
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
