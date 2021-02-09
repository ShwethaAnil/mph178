package com.mphasis.training.pl;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.mphasis.training.exceptions.BuisnessException;
import com.mphasis.training.pojos.Product;
import com.mphasis.training.services.ProductService;
import com.mphasis.training.services.ProductServiceImpl;

public class ProductApp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ProductService pService=new ProductServiceImpl();
	do {
		System.out.println("Welcome to Mphasis Cart");
		System.out.println("1. Add Product \n 2.ViewProduct"
				+ "\n3.ViewProductByIndex"
				+ "\n4.Remove Product \n5.Sort Products on Name \n 6.Exit");
		switch(sc.nextInt()) {
		case 1: System.out.println("Enter the Pid, pname,qty,brand,cost");
		     Product p=new Product(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble());
		     try {
		     pService.addProduct(p);
		     }catch(Exception e) {
		    	 System.out.println(e.getMessage());
		     }
		     break;
		case 2:try {
			List<Product> prods=pService.getAll();
			prods.forEach(p1->System.out.println(p1.getPid()+" "+p1.getPname()));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
			break;
		case 3:System.out.println("Enter the index to retrive");
		     try {
				Product pr=pService.getProductByIndex(sc.nextInt());
			System.out.println(pr);
		     } catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4:System.out.println("Enter the index to remove");
		      try {
				pService.removeProduct(sc.nextInt());
				System.out.println("removed");
			} catch (BuisnessException e) {
				System.out.println(e.getMessage());
			}
		      
			break;
		case 5: System.out.println("list on products sort on names");
		       try {
				List<Product> pros=pService.getAll();
				Collections.sort(pros, 
						(p1,p2)-> p1.getPname()
								.compareTo(p2.getPname()));
				pros.forEach(p1->System.out.println(p1));
		       }catch(Exception e) {
		    	   System.out.println(e.getMessage());
		       }
		       break;
		case 6: System.out.println("Thank you");
		        System.exit(0);
		default: System.out.println("invalid");        
		}
	}while(true);
	}

}
