package com.mphasis.training.pojos;

public class Account{
	private int accNum;//instance varaibles
	private String accHolderName;
	private double balance;
	private static String bank;
	private final String BANK1="HDFC";
	public Account(int accNum, String accHolderName) {
		super();
		this.accNum = accNum;
		this.accHolderName = accHolderName;
	}
	public Account(int accNum, String accHolderName, double balance) {
		super();
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accHolderName=" + accHolderName + ", balance=" + balance + "]";
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static String getBank() {
		return bank;
	}
	public static void setBank(String bank) {
		Account.bank = bank;
	}
	
	
	
	
	
	
	
	
	
	
//	public static void setBank(String bank) {
//		Account.bank=bank;
//	}	
//	public String toString() {
//		return accNum+" "+accHolderName;
//	}
//	//constructor
//	public Account(int accNum,String accHolder) {
//		this.accNum=accNum;
//		this.accHolderName=accHolder;
//	}
//	public Account(int accNum, String accHolder,double balance) {
//		this.accNum=accNum;
//		this.accHolderName=accHolder;
//		this.balance=balance;
//	}	
//	//setters
//	public void setAccHolderName(String accHolder) {
//		this.accHolderName=accHolder;
//	}
//	public void setAccNum(int accNum) {
//		this.accNum=accNum;
//	}
//	//getters
//	public int getAccNum() {
//		return accNum;
//	}
	
}
