package com.mphasis.training.basicprograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original=131, reverse=0,rem, temp;
		temp=original;
		while(original!=0) {
			rem=original%10;// 131%10= 1rem=1  rem=3 1
			//reverse=reverse+(rem*10);// 0+(1*10)reverse=10
			reverse=(reverse*10)+rem;// 10+3= 131  
			original=original/10;// original= 13;	
		}
		if(reverse==temp) {
			System.out.println(reverse+" is a palindrome");
		}else {
			System.out.println(reverse+"is not a palindrome");
		}

	}

}
