package com.mphasis.training.collectionsdemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm=new TreeMap<Integer, String>();
		hm.put(113, "Nagaveni");
		hm.put(124, "Namreen");
		hm.put(125,"Sushma");
		hm.put(16,"Nagaranjini");
		hm.put(17,"Arunima");
		//hm.put(null, "Shwetha");
		System.out.println(hm);
		
		for(Entry<Integer, String> h:hm.entrySet()) {
			System.out.println(h.getKey()+" "+h.getValue());
		}
		
		HashMap<Long,HashMap<String,String>> hma=new HashMap<>();
		
		//TreeMap<String,List<String>>
	}

}
