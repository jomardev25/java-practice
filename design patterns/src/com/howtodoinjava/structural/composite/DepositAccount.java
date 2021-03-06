package com.howtodoinjava.structural.composite;

public class DepositAccount extends Component {

	private String accountNo;
    private float accountBalance;
    private AccountStatement currentStmt;

    public DepositAccount(String accountNo, float accountBalance) {
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
