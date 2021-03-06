package com.solid_principles.open_closed.solution;

public class Division implements CalculatorOperation {

	private double number1;
	private double number2;
	private double result = 0.0;

	public Division(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public double getResult() {
		return result;
	}

	@Override
	public void perform() {
		if(number2 != 0) {
			result = number1 * number2;
		}
	}

}
