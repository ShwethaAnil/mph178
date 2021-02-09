package com.mphasis.training.oops;

@FunctionalInterface
interface Calc{
	public double cal(int a,int b);
	public default double cal(int a,int b,int c) {
		return a+b+c;
	}
	public static void demo() {
		System.out.println("done");
	}
}
public class Demo {

	public static void main(String[] args) {
		Calc c1=new Calc() {
			public double cal(int a,int b) {
				return a+b;
			}
		};
		
		Calc.demo();
		System.out.println(c1.cal(123,98,78));
		Calc c2=(int a,int b) -> a-b;
		Calc c3=(int a,int b) -> a*b;
		Calc c4=(int a,int b) -> {
			if(b>0)
				return a/b;
			else
				return 0;
		};
				
		
		
		System.out.println(c4.cal(25,5));

		
	}

}
