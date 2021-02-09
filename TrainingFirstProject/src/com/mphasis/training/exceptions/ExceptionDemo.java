package com.mphasis.training.exceptions;
import java.util.Scanner;
class ExampleService{
	public double div(String num1,String num2)throws BuisnessException {
		double div1=0;
		if(num1.matches("[0-9]{1,3}") && num2.matches("[0-9]{1,3}")) {
			div1=Integer.parseInt(num1)/Integer.parseInt(num2);
		}else {
			throw new BuisnessException("Invalid value");
		}
		return div1;		
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		ExampleService eService=new ExampleService();
		try {
		System.out.println(eService.div(s1, s2));
		}catch(BuisnessException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("code continues........");

	}

}
