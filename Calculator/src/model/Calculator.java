package model;

public class Calculator {
	private int numberOne;
	private int numberTwo;
	private String operator;
	private int result;
	
	// constructors
	public Calculator() {

	}
	
	public Calculator(int numberOne, int numberTwo, String operator) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.operator = operator;
	}

	// getters and setters
	
	public int getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}
	public int getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public void doCalculation() {
		if(operator.contains("add")) setResult(numberOne + numberTwo);
		else if(operator.contains("subtract")) setResult(numberOne - numberTwo);
		else if(operator.contains("multiply")) setResult(numberOne * numberTwo);
		else if(operator.contains("divide")) setResult(numberOne / numberTwo);
		else if(operator.contains("power")) setResult((int) Math.floor(Math.pow(numberOne, numberTwo)));
		else setResult(-1);
	}


	@Override
	public String toString() {
		return "Calculator[" + numberOne + ":" + numberTwo + ":" + operator + ":" + result + "]";
	}

	
}