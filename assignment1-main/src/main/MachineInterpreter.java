package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {

	private Machine machine;
	private State currentState;
	
	public void run(Machine m) {
		machine = m;
		currentState = m.getInitialState();
	}

	public State getCurrentState() {
		return currentState;
	}

	public void processEvent(String string) {
		boolean conditionFulfilled = true;
		Transition t = currentState.getTransitionByEvent(string);
		if(t == null) {
			return;
		}
		if(t.hasSetOperation()) {
			checkForOperationVar(t);
		}
		if(t.hasOperation()) {
			checkForIncrementOperation(t);
			checkForDecrementOperation(t);
		}
		if(t.isConditional()) {
			conditionFulfilled = false;
			conditionFulfilled = checkForEqualOperation(t, conditionFulfilled);
			conditionFulfilled = checkForGreaterOperation(t, conditionFulfilled);
			conditionFulfilled = checkForLessOperation(t, conditionFulfilled);
		}
		
		if(conditionFulfilled) currentState = t.getTarget();
	}

	public int getInteger(String string) {
		return machine.getVariable(string);
	}
	
	private void checkForOperationVar(Transition t) {
		String varName = (String) t.getOperationVariableName();
		if(varName != null) {
			machine.addVariable(varName, t.getOperationVariableValue());
		}
	}
	
	private void checkForIncrementOperation(Transition t) {
		if(t.hasIncrementOperation()) {
			machine.incrementVariable((String) t.getOperationVariableName());
		}
	}
	
	private void checkForDecrementOperation(Transition t) {
		if(t.hasDecrementOperation()) {
			machine.decrementVariable((String) t.getOperationVariableName());
		}
	}
	
	private boolean checkForEqualOperation(Transition t, boolean b) {
		if(t.isConditionEqual()) {
			int val = machine.getVariable((String) t.getConditionVariableName());
			return val == t.getConditionComparedValue();
		} 
		return b;
	}
	
	private boolean checkForLessOperation(Transition t, boolean b) {
		if(t.isConditionLessThan()) {
			int val = machine.getVariable((String) t.getConditionVariableName());
			return val < t.getConditionComparedValue();
		}
		return b;		
	}
	
	private boolean checkForGreaterOperation(Transition t, boolean b) {
		if(t.isConditionGreaterThan()) {
			int val = machine.getVariable((String) t.getConditionVariableName());
			return val > t.getConditionComparedValue();
		}
		return b;
	}
}
