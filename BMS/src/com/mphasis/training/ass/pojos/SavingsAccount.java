package com.mphasis.training.ass.pojos;

public class SavingsAccount extends Account {
final int MIN_BALANCE=1000;
	@Override
	public void withdraw(double amount) {
		if((balance-amount)>=MIN_BALANCE) {
			balance=balance-amount;
			System.out.println("Withdraw completed "+balance);
		}else {
			System.out.println("Min balance should maintain "+MIN_BALANCE);
		}
			

	}

}
