package com.mphasis.training.exceptions;

class Calculator{
	public double method(int a,int b) throws Exception {
		return div(a,b);
	}
	public double div(int a,int b)throws Exception {
		double div=0;
		if(b<10) {
		div=a/b;
		}else {
			throw new Exception("Number can divide with in 10");
		}		
		return div;
	}
}
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		try {
			System.out.println(c1.method(12, 10));
		} catch(ArithmeticException e){
			e.printStackTrace();
		}catch(RuntimeException e){
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finalyy code");
		}
		System.out.println("code continuees");

	}

}
