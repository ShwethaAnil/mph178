package com.mphasis.training.ass.pojos;

public class CurrentAccount extends Account {

	private final int OVER_DRAFT=-50000;
	@Override
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Withdrawn and balance is "+balance);
	}
	
	public boolean getOverdraft_limit() {
		if(balance>OVER_DRAFT)
			return true;
		else
			return false;
	}
	
	

}
