package com.mphasis.training.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
	public void method()  {
		if(10<20) {
			throw new RuntimeException();
		}
		
	}
}

public class ExceptionDemo5 {
	public static void main(String[] args) {
Parent p1=new Parent();
p1.method();
	}

}
