package com.mphasis.training.basicprograms;

import java.util.Arrays;
import java.util.Scanner;

import com.mphasis.training.pojos.Person;

public class PersonArray {

	public static void main(String[] args) {
	
		Person p1=new Person(13,"Anish");
		Person p2=new Person(13, "Anish");
		if(p1.equals(p2)) {
			System.out.println("persons are equal");
		}else {
			System.out.println("persons are not equals");
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many persons you want");
	Person[] persons=new Person[sc.nextInt()];
	
	for(int i=0;i<persons.length;i++) {
		System.out.println("enter pid and name");
		persons[i]=new Person(sc.nextInt(), sc.next());
	}
	
	
	
	
	
	Arrays.sort(persons);
	System.out.println("Persons List");
	for(Person p:persons) {
		System.out.println(p.getPid()+" "+p.getPname());
	}

	}

}
