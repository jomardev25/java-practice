package com.solid_principles.liskov_substitution.solution;

import java.math.BigDecimal;

import com.solid_principles.liskov_substitution.solution.Account;

public abstract class WithdrawableAccount extends Account {

	public abstract void withdraw(BigDecimal amount);

}
