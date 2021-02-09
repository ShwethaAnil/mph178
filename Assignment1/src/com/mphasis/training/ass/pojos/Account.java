package com.mphasis.training.ass.pojos;

public class Account {

	private long accNum;
	private double balance;
	private Person accHolder=new Person();
	
	public void withdraw(double amount) {
		if(amount>0) {
			if(amount<balance) {
				balance=balance-amount;
				System.out.println("Withdaw completed "+balance);
			}else {
				System.out.println("You have less balance");
			}
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Amount deposited "+balance);
		}else {
			System.out.println("Invalid amount");
		}
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
}
