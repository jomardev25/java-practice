package com.solid_principles.liskov_substitution.problem;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {

	private Account account;

    public BankingAppWithdrawalService(Account account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }


    public void printBalance() {
    	System.out.println("Current Balance: " + account.getBalance());
    }

}
