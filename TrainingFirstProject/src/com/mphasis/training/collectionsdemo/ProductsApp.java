package com.mphasis.training.collectionsdemo;

import java.util.HashSet;
import java.util.*;
import java.util.TreeSet;

import com.mphasis.training.pojos.Product;

public class ProductsApp {

	public static void main(String[] args) {
	
		//Set<Product> products=new HashSet<Product>();
		List<Product> products=new ArrayList<>();
		products.add(new Product(1, "Marker", 10, "Flair", 180));
		products.add(new Product(2, "Duster", 13, "Flair", 80));
		products.add(new Product(3, "Bottle", 100, "TW", 980));
		products.add(new Product(4, "Hanki", 23, "Flair", 80));
		products.add(new Product(5, "Marker", 10, "Flair", 180));
		products.add(new Product(1, "Marker", 10, "Flair", 180));
		
		for(Product p:products) {
			System.out.println(p);
		}
		

	}

}
