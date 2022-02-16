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
		checkForOperationVar(t);
		
		
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
	
}
