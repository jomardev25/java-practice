package com.howtodoinjava.structural.composite;

public class SavingsAccount extends Component {

	private String accountNo;
    private float accountBalance;
    private AccountStatement currentStmt;

    public SavingsAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public String getAccountNo() {
        return accountNo;
    }

	@Override
	public AccountStatement getStatement() {
		return currentStmt;
	}

	@Override
	public float getBalance() {
		return accountBalance;
	}

}
