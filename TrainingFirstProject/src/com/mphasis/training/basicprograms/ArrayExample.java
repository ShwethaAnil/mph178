package com.mphasis.training.basicprograms;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample {
	public static void main(String[] args) {		
		int a[]= {123,7878,6767};
		int b[]=new int[6];
		b[0]=5;
		b[1]=88;
		b[2]=65;
		b[3]=78;
		b[4]=77;
		b[5]=54;
		
		System.out.println("For loop");
		for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
		}
		System.out.println("enhanced for loop");
		for(int s:b) {
			System.out.println(s);
		}
		int temp=0;
		int len=b.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
			if(b[j]>b[j+1]) {
				temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
			}
			}
		}
		
		System.out.println("after sort");
		for(int i:b) {
			System.out.println(i);
		}
		
		Arrays.sort(b);
		System.out.println("after arrays sort");
		for(int i:b) {
			System.out.println(i);
		}
		System.out.println("Two Dimensional Array");
		int arr2[][] =new int[3][3];
		
		int arr1[][] = {{12,34,89},{23,45,76}};
		System.out.println(arr1.length);
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<=arr1.length;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("enhanced for loop for two dimension");	
		for(int ar[]:arr1) {
			for(int br:ar) {
				System.out.print(br+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Array 2 dimension");
		//String
		
		String[] sarr= {"su","sa","re","ga"};
		Arrays.sort(sarr);
		for(String s:sarr) {
			System.out.println(s);
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arr[]=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the value");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Values");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
