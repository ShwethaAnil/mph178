package com.mphasis.training.oops;

import java.util.Scanner;
import com.mphasis.training.pojos.Account;
public class OopsDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Account.setBank("HDFC");
		do {
		System.out.println("1. Zero Balance Account\n "
				+ "2.Account with 1000 \n3.Exit");
		switch(sc.nextInt()) {
		case 1: System.out.println("enter accNum and Name");
			Account acc=new Account(sc.nextInt(), sc.next());
			System.out.println("Account created"+acc);
		    break;
		case 2:System.out.println("enter accNum and name and depo amount");
		       Account acc1=
		    new Account(sc.nextInt(), sc.next(),sc.nextDouble());
		       System.out.println("Account created"+acc1.getAccNum());
		       break;
		case 3:   System.out.println("Thank You");
		           System.exit(0);
		default:System.out.println("invalid choice");       
		}
		}while(true);
		
		
		
		
	}
	

	
	
}
