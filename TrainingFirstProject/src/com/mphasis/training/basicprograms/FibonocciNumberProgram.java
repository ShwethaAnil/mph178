package com.mphasis.training.basicprograms;

public class FibonocciNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0,n2=1,n3,i,count=67;
System.out.println(n1+" "+n2);
for(i=2;i<count;i++) { //i=3
	n3=n1+n2;//n3=2
	System.out.println(" "+n3);
	n1=n2;   //n1=1
	n2=n3;   //n2=1
}
	}

}
