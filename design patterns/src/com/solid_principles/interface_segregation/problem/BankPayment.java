package com.solid_principles.interface_segregation.problem;

import java.util.List;

public class BankPayment implements Payment {

	@Override
	public void initiatePayments() {
		// TODO Auto-generated method stub
	}

	@Override
	public Object status() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void intiateLoanSettlement() { // This method is not required here. This is for bank payment only
		// TODO Auto-generated method stub

	}

	@Override
	public void initiateRePayment() { // This method is not required here. This is for bank payment only
		// TODO Auto-generated method stub
	}

}
