package com.mphasis.training.pojos;

public class Employee {
	private int eid;
	private String ename;
	private int age;
	public Employee() {
		
	}
	public Employee(int eid,String ename) {
		this.eid=eid;
		this.ename=ename;
	}
	
	public Employee(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.eid=i;
		this.ename=string;
		this.age=j;
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getEid() {
		return eid;
	}
	
	public String toString() {
		return eid+" "+ename+" "+age;
	}

}
