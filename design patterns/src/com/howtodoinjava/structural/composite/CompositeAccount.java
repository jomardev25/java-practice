package com.howtodoinjava.structural.composite;

public class CompositeAccount extends Component {

	private float totalBalance;
	private AccountStatement compositeStmt;
	private AccountStatement individualStmt;

	public float getBalance() {
        totalBalance = 0;
        for (Component f : this.list) {
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }

	@Override
	public AccountStatement getStatement() {
		for (Component f : this.list) {
            individualStmt = f.getStatement();
            compositeStmt.merge(individualStmt);
        }
        return compositeStmt;
	}

}
