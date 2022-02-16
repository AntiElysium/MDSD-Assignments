package main.metamodel;

public class Transition {
	
	private String event; //Event fires transition
	private State target;
	private String operationVariablename, conditionVariableName;
	private Integer operationVariableValue, conditionComparedValue;
	private boolean incrementOperation = false;
	private boolean decrementOperation = false;
	private boolean setOperation = false;
	private boolean conditional = false;
	private boolean conditionGreaterThan = false;
	private boolean conditionLessThan = false;
	private boolean conditionEqual = false;
	private boolean operation = false;
	
	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return target;
	}

	public boolean hasSetOperation() {
		return setOperation;
	}

	public boolean hasIncrementOperation() {
		return incrementOperation;
	}

	public boolean hasDecrementOperation() {
		return decrementOperation;
	}

	public Object getOperationVariableName() {
		return operationVariablename;
	}
	
	public int getOperationVariableValue() {
		return operationVariableValue;
	}

	public boolean isConditional() {
		return conditional;
	}

	public Object getConditionVariableName() {
		return conditionVariableName;
	}

	public Integer getConditionComparedValue() {
		return conditionComparedValue;
	}

	public boolean isConditionEqual() {
		return conditionEqual;
	}

	public boolean isConditionGreaterThan() {
		return conditionGreaterThan;
	}

	public boolean isConditionLessThan() {
		return conditionLessThan;
	}

	public boolean hasOperation() {
		return operation;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setTarget(State target) {
		this.target = target;
	}

	public void setOperationVariables(String operationVariablename, int operationVariableValue) {
		this.operationVariablename = operationVariablename;
		this.operationVariableValue = operationVariableValue;
	}
	
	public void setOperationVariableName(String operationVariableName) {
		this.operationVariablename = operationVariableName;
	}

	public void setConditionVariableName(String conditionVariableName) {
		if(conditionVariableName != null) {
			conditional = true;			
		}
		this.conditionVariableName = conditionVariableName;
	}

	public void setConditionComparedValue(Integer conditionComparedValue) {
		this.conditionComparedValue = conditionComparedValue;
	}

	public void setIncrementOperation(boolean incrementOperation) {
		this.incrementOperation = incrementOperation;
	}

	public void setDecrementOperation(boolean decrementOperation) {
		this.decrementOperation = decrementOperation;
	}

	public void setSetOperation(boolean setOperation) {
		this.setOperation = setOperation;
	}

	/*public void setConditional(boolean conditional) {
		this.conditional = conditional;
	}*/

	public void setConditionGreaterThan(boolean conditionGreaterThan) {
		this.conditionGreaterThan = conditionGreaterThan;
	}

	public void setConditionLessThan(boolean conditionLessThan) {
		this.conditionLessThan = conditionLessThan;
	}

	public void setConditionEqual(boolean conditionequal) {
		this.conditionEqual = conditionequal;
	}

	public void setOperation(boolean operation) {
		this.operation = operation;
	}

	
}
