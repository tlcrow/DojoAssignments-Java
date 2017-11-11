
public class Calculator {
	private double results;
	private double operandOne;
	private String operation;
	private double operandTwo;
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getOperation() {
		return operation;
	}
	public void performOperation() {
		if(operation.equals("+")) {
			this.results = operandOne + operandTwo;
		}
		else if(operation.equals("-")) {
			this.results = operandOne - operandTwo;
		}
		else {
			System.out.println("Please use valid operation");
			this.results = 0.0;
		}
	}
	public double getResults(){
		return results;
	}
}
