package com.solid_principles.liskov_substitution.problem;

import java.math.BigDecimal;

public abstract class Account {

	public abstract void deposit(BigDecimal amount);

	public abstract BigDecimal getBalance();

    /**
     * Reduces the balance of the account by the specified amount
     * provided given amount > 0 and account meets minimum available
     * balance criteria.
     *
     * @param amount
     */
	public abstract void withdraw(BigDecimal amount);

}
