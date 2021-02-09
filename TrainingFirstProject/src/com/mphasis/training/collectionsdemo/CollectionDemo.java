package com.mphasis.training.collectionsdemo;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

import com.mphasis.training.pojos.Person;

public class CollectionDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		System.out.println("How many Persons you want to create");
//		Person[] persons=new Person[sc.nextInt()];
//		
//		for(int i=0;i<persons.length;i++) {
//			System.out.println("Enter pid and pname");
//		persons[i]=new Person(sc.nextInt(), sc.next());
//		}
//		System.out.println("person details");
//		for(Person st:persons) {
//			System.out.println(st.getPname());
//		}

		TreeSet v1=new TreeSet();
		v1.add(767);
		v1.add("Shivam");
		v1.add("Swagath");
		v1.add("Manoj");
		v1.add("Divya");
		v1.add("Smitha");
		v1.add("Rakshitha");
		v1.add("Divya");
		
		
//		v1.add(new Person(12,"Sam"));
//		v1.add(new Person(13,"Mohith"));
//		v1.add(new Person(14,"Sam"));
//		v1.add(new Person(15,"Mohith"));
//		v1.add(new Person(15,"Mohith"));
		
		System.out.println(v1);
//		System.out.println(v1.size());
//		v1.remove(2);
//		System.out.println(v1);
//		
//		System.out.println(v1.size());
//		
//		Hashtable ht=new Hashtable();
//		ht.put(1,"xyz");
//		ht.put(1,"asd");
//		
//		System.out.println(ht);
		
		
		
	}

}
