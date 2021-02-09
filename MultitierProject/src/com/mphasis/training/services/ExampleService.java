package com.mphasis.training.services;

import com.mphasis.training.exceptions.BuisnessException;

public class ExampleService {
	public double div(String num1,String num2)throws BuisnessException {
		double div1=0;
		if(num1.matches("[0-9]{1,3}") && 
				num2.matches("([1-9])([0-9]{1,2})")) {
			div1=Integer.parseInt(num1)
					/Integer.parseInt(num2);
		}else {
			throw new BuisnessException("Invalid value");
		}
		return div1;		
	}
}
