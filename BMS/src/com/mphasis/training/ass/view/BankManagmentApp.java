package com.mphasis.training.ass.view;

import java.util.Random;

import com.mphasis.training.ass.pojos.Account;
import com.mphasis.training.ass.pojos.CurrentAccount;
import com.mphasis.training.ass.pojos.SavingsAccount;

public class BankManagmentApp {

	public static void main(String[] args) {
		Account ac=new SavingsAccount();
		ac.getAccHolder().setPname("Smithi");
		ac.getAccHolder().setAge(20);
		Random rd=new Random(); 
		ac.setAccNum(rd.nextInt(100000));
		ac.setBalance(1000);
		System.out.println("Account Details");
		System.out.println(ac);
		ac.deposit(2000);
		ac.withdraw(500);
		System.out.println(ac.getAccHolder().getPname()+" "+ac.getAccNum());
		System.out.println("=================================");
		System.out.println("Current Account");
		Account ac1=new CurrentAccount();
		ac1.getAccHolder().setPname("Kathy");
		ac1.getAccHolder().setAge(20);
		
		ac1.setAccNum(rd.nextInt(100000));
		ac1.setBalance(10000);
		System.out.println("Account Details");
		System.out.println(ac1);
		ac1.deposit(2000);
		ac1.withdraw(5000);
		if(((CurrentAccount) ac1).getOverdraft_limit()){
			System.out.println("Overdarft limit not reached");
		}else {
			System.out.println("overdraft limit reached");
		}
		
		ac1.withdraw(70000);
		if(((CurrentAccount) ac1).getOverdraft_limit()){
			System.out.println("Overdarft limit not reached");
		}else {
			System.out.println("overdraft limit reached");
		}
		
		
		System.out.println(ac1.getAccHolder().getPname()+" "+ac1.getAccNum());
	}

}
