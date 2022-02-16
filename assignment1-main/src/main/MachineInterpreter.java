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
		
		
		currentState = t.getTarget();
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
	
}
