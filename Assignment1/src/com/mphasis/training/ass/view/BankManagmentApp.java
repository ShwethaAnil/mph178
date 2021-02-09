package com.mphasis.training.ass.view;

import java.util.Random;

import com.mphasis.training.ass.pojos.Account;

public class BankManagmentApp {

	public static void main(String[] args) {
		Account ac=new Account();
		ac.getAccHolder().setPname("Smithi");
		ac.getAccHolder().setAge(20);
		Random rd=new Random(); 
		ac.setAccNum(rd.nextInt(100000));
		ac.setBalance(1000);
		System.out.println("Account Details");
		System.out.println(ac.getAccHolder().getPname()+" "+ac.getAccNum());

	}

}
