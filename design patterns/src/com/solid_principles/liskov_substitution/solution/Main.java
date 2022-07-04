package com.solid_principles.liskov_substitution.solution;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.deposit(BigDecimal.valueOf(100.00));

		BankingAppWithdrawalService withdrawalService = new BankingAppWithdrawalService(savingsAccount);
		withdrawalService.withdraw(BigDecimal.valueOf(30.90));

		withdrawalService.printBalance();

	}

}
