package com.mphasis.training.pl;

import com.mphasis.training.services.ExampleService;

import java.util.Scanner;

import com.mphasis.training.exceptions.BuisnessException;

public class ExceptionDemo {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	ExampleService eService=new ExampleService();
	try {
	System.out.println(eService.div(s1, s2));
	}catch(BuisnessException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("code completed");
}
}
