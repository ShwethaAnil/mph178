package com.mphasis.training.basicprograms;

import com.mphasis.training.pojos.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setEid(123);
		e1.setEname("Shwteha");
		e1.setAge(31);
		
		Employee e2=new Employee(124,"Suma");
		e2.setAge(56);
		
		Employee e3=new Employee(125,"Shekar",7);
		
		Employee[]  eArr=new Employee[3];
		eArr[0]=e1;
		eArr[1]=e2;
		eArr[2]=e3;
		for(Employee e:eArr) {
		System.out.println(e.getEid());
		}
	}

}
