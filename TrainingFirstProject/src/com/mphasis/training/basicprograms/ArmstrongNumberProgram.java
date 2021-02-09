package com.mphasis.training.basicprograms;

import java.util.Scanner;

public class ArmstrongNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arm=0,a,temp;
		System.out.println("Enter number");
		int number=sc.nextInt();
		temp=number;
		while(number>0) {
			a=number%10;
			number=number/10;
			arm= arm+(a*a*a);
		}
		if(temp==arm) {
			System.out.println("armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}

}
