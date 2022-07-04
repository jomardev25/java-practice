package com.solid_principles.liskov_substitution.solution;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {

	private WithdrawableAccount withdrawableAccount;

    public BankingAppWithdrawalService(WithdrawableAccount withdrawableAccount) {
        this.withdrawableAccount = withdrawableAccount;
    }

    public void withdraw(BigDecimal amount) {
    	withdrawableAccount.withdraw(amount);
    }


    public void printBalance() {
    	System.out.println("Current Balance: " + withdrawableAccount.getBalance());
    }

}
