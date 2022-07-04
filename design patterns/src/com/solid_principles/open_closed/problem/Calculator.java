package com.solid_principles.open_closed.problem;

import java.security.InvalidParameterException;

public class Calculator {

	/*
	 * Although this may seem fine, it's not a good example of the OCP.
	 * When a new requirement of adding multiplication or divide functionality comes in, we've no way besides changing the calculate method of the Calculator class.
	 *
	 */
	public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getNumber1() + addition.getNumber2());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getNumber1() - subtraction.getNumber2());
        }
    }

}
