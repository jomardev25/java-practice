package com.solid_principles.liskov_substitution.problem;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		FixedTermDepositAccount fixedTermDepositAccount = new FixedTermDepositAccount();
		fixedTermDepositAccount.deposit(BigDecimal.valueOf(100.00));

		BankingAppWithdrawalService withdrawalService = new BankingAppWithdrawalService(fixedTermDepositAccount);
		withdrawalService.withdraw(BigDecimal.valueOf(30.90));

		withdrawalService.printBalance();

	}

}
