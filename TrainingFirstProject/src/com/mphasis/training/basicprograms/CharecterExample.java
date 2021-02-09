package com.mphasis.training.basicprograms;
public class CharecterExample {
	public static void main(String[] args) {
		String str="Java &Code* 11";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.println("upper case "+str.charAt(i));
			}else if(Character.isLowerCase(str.charAt(i))) {
				System.out.println("Lower case\t"+str.charAt(i));
			}else if(Character.isDigit(str.charAt(i))) {
				System.out.println("Digit "+str.charAt(i));
			}else if(Character.isWhitespace(str.charAt(i))) {
				System.out.println("White Space");
			}else {
				System.out.println("Special Charecter");
			}
			
		}
		
	
		

	}

}
