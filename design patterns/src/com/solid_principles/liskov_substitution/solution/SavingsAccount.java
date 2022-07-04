package com.solid_principles.liskov_substitution.solution;

import java.math.BigDecimal;

public class SavingsAccount extends WithdrawableAccount {

	private BigDecimal balance = BigDecimal.ZERO;

	@Override
	public void deposit(BigDecimal amount) {
		balance = balance.add(amount);
	}

	@Override
	public BigDecimal getBalance() {
		return balance;
	}

	@Override
	public void withdraw(BigDecimal amount) {
		balance = balance.subtract(amount);
	}

}
