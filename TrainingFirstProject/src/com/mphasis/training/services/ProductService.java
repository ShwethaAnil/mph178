package com.mphasis.training.services;

import java.util.List;

import com.mphasis.training.exceptions.BuisnessException;
import com.mphasis.training.pojos.Product;

public interface ProductService {
	public void addProduct(Product p)throws BuisnessException;
	public List<Product> getAll()throws BuisnessException;
	public Product getProductByIndex(int index)throws BuisnessException;
	public void removeProduct(int index)throws BuisnessException;
}
