package com.mphasis.training.ass.pojos;

abstract public class Account {

	private long accNum;
	protected double balance;
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	private Person accHolder=new Person();
	
	public abstract void withdraw(double amount);
	
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
