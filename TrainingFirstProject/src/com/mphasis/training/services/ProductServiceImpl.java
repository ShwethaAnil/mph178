package com.mphasis.training.services;

import java.util.ArrayList;
import java.util.List;

import com.mphasis.training.exceptions.BuisnessException;
import com.mphasis.training.pojos.Product;

public class ProductServiceImpl implements ProductService {

	List<Product> products=null;
	
	public ProductServiceImpl() {
		products=new ArrayList<>();
	}
	
	
	
	@Override
	public void addProduct(Product p) throws BuisnessException {
		if(p.getPid()>0 && p.getPid()<100) {
			products.add(p);
		}else {
			throw new BuisnessException("Invalid Id");
		}
	}

	@Override
	public List<Product> getAll() throws BuisnessException {
		if(products.isEmpty()) {
			throw new BuisnessException("No products available");
		}else {
			return products;
		}
		
	}
	@Override
	public Product getProductByIndex(int index) throws BuisnessException {
		Product p=products.get(index);
		if(p!=null)
			return p;
		else
			throw new BuisnessException("Product is not available");
	}

	@Override
	public void removeProduct(int index) throws BuisnessException {
		if(index>=products.size()) {
			throw new BuisnessException("Wrong index");	
		}else {
			products.remove(index);
		}
	}

}
