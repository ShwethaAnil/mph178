package com.mphasis.training.collectionsdemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Queue<String> qu1=new PriorityQueue<String>();
			qu1.add("Maanasa");
			qu1.add("Akansha");
			qu1.add("Mythri");
			qu1.add("Lavanya");
			qu1.add("Chaithanya");
			qu1.add("Sarika");
			
			
			System.out.println(qu1);
			System.out.println(qu1.peek());
			qu1.poll();
			System.out.println(qu1);
			
			Deque<String> dq=new ArrayDeque<String>();
			dq.add("Ashish");
			dq.add("Anchit");
			dq.add("Divya Prakash");
			dq.addFirst("Saish");
			dq.addLast("Utkarsh");
			dq.add("Aayush");
			dq.addLast("Utkarsh");
			dq.add("Aayush");
			
			System.out.println(dq);
			
			dq.remove();
			System.out.println(dq);
			dq.removeFirstOccurrence("Utkarsh");
			System.out.println(dq);
	}

}
