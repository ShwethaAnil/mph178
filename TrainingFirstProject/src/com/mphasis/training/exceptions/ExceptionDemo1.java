package com.mphasis.training.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			try {
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		double div=num1/num2;
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
			}
			
		String str=sc.next();
		System.out.println(str.charAt(7));
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("code continuees..");
	}

}
