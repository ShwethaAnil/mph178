package com.mphasis.training.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListDemo {
	public static void main(String[] args) {
//		List<Integer> list=new ArrayList<>();
//			list.add(98);
//			list.add(567);
//			list.add(65675);
//			list.add(12);
//			System.out.println(list);
//			list.add(1, 6576);
//			System.out.println(list);
//			List<Integer> list1=new ArrayList<>();
//			list1.add(786);
//			list1.add(886);
//			list1.add(686);
//			list1.add(586);
//			System.out.println(list1+" list1");
//			list.addAll(list1);
//			System.out.println(list);
//			list.retainAll(list1);
//			System.out.println(list);
//			list.remove(2);//index
//			System.out.println(list);
//			System.out.println(list.get(1));
//			
//			System.out.println("enhanced for loop");//java 5
//			for(int s:list) {
//				System.out.println("name "+s);
//			}
//			
//			System.out.println("Iterator");//java 1.2
//			Iterator<Integer> itr=list.iterator();
//			while(itr.hasNext()){
//				System.out.println(itr.next());
//			}
//	
//			System.out.println("List Iterator");//java 1.2
//			ListIterator<Integer> litr=list.listIterator(2);
//			System.out.println("Backward");
//			while(litr.hasPrevious()) {
//				System.out.println(litr.previous());
//			}
//			System.out.println("Forward Direction");
//			while(litr.hasNext()) {
//				System.out.println(litr.next());
//			}
//			System.out.println("Java 8 version");
//			list.forEach(s1->System.out.println(s1));
		
		List<Integer> list=new ArrayList<>();
		list.add(98);
		list.add(567);
		list.add(65675);
		list.add(12);
		list.add(56467);
		
		System.out.println(list);
		
		//Collections.sort(list);
//
//		System.out.println(list);
//		
//		Collections.binarySearch(list, 567);
//		System.out.println(Collections.binarySearch(list, 567));
	
//		Collections.shuffle(list);
//		System.out.println(list);
		
//		//Collections.reverse(list);
//		Collections.reverseOrder();
//		System.out.println(list);
	
	}
}
