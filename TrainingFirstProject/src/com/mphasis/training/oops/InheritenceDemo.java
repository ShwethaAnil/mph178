package com.mphasis.training.oops;

abstract class Employee{
	private int empid;
	private String ename;
	public Employee(int empid,String ename) {
		this.empid=empid;
		this.ename=ename;
	}
	public int getEmpid() {
		return empid;
	}
	
	
	@Override
	public String toString() {
		return empid+" "+ename;
	}
	
}

class ContractEmployee extends Employee{
	private double wages;
	public ContractEmployee(int empid,String ename,double wages) {
		super(empid,ename);
		this.wages=wages;
	}
	
	
	@Override
	public String toString() {
		return "eid" +super.getEmpid()+"wages"+wages;
	}
}

class PermanentEmployee extends Employee{
	private double salary;
	public PermanentEmployee(int empid,String ename,
			double sal) {
		super(empid,ename);
		this.salary=sal;
	}
	
	public void dummyMethod() {
		System.out.println("code");
	}
	@Override
	public String toString() {
		return "Salary"+salary+" "+super.toString();
	}
	
}
public class InheritenceDemo {
	public static void main(String[] args) {
		ContractEmployee c1=new ContractEmployee(123,"SS",76);
		System.out.println(c1);

		PermanentEmployee pm=new PermanentEmployee(124, "Som",765654);
		System.out.println(pm);
		

//		Employee e1=new Employee(125,"Man");
//		System.out.println(e1);
		
		
		Employee emp=new PermanentEmployee(129, "Raj", 8767);
		((PermanentEmployee) emp).dummyMethod();
//		int i=10;
//		long j=i;
//		
//		float f=10.9f;
//		int i2=(int)f;
//		System.out.println(i2);
//		long l1=7878988989l;
//		int i1=(int)l1;//type casting
//		System.out.println(l1);
//		System.out.println(i1);

	}

}
