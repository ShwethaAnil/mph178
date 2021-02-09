package com.mphasis.training.ass.pojos;

public class Person {
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + "]";
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	private String pname;
	private float age;
	
}
