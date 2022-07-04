package com.solid_principles.liskov_substitution.solution;

import java.math.BigDecimal;

public abstract class Account {

	public abstract void deposit(BigDecimal amount);

	public abstract BigDecimal getBalance();

}
