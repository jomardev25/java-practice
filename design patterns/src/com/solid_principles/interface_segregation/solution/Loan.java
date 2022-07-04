package com.solid_principles.interface_segregation.solution;

public interface Loan extends Payment {

	public void intiateLoanSettlement();

	public void initiateRePayment();

}
