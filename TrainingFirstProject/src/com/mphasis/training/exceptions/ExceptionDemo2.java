package com.mphasis.training.exceptions;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mphasis.training.exceptions.ExceptionDemo1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("code done");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Code continuees");

	}

}
