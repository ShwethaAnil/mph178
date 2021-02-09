package com.mphasis.training.collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> names=new TreeSet<>();
		names.add("Smitha");
		names.add("Divya");
		names.add("Vyshnavi");
		names.add("Pavithra");
		names.add("Pooja");
		names.add("Ashritha");
		names.add("Usha");
		
		System.out.println(names);
		names.remove("Usha");
		System.out.println(names);
		
		if(names.contains("Pooja")) {
			System.out.println("Pooja is present in the list");
		}else {
			System.out.println("pooja is not present in the list");
		}
		
		names.removeIf(n-> (n.length()<6));
		System.out.println(names);
		
		names.removeIf(t-> (t.charAt(0)=='S'));
		System.out.println(names);
		System.out.println("enhanced for loop");//java 5
		for(String s:names) {
			System.out.println("name "+s);
		}
		
		System.out.println("Iterator");//java 1.2
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("Java 8 version");
		names.forEach(s1->System.out.println(s1));
	}

}
