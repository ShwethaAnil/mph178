package com.mphasis.training.pojos;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {
	private int pid;
	private String pname;
	private String adarNum;
	
	
	
	public String getAdarNum() {
		return adarNum;
	}
	public void setAdarNum(String adarNum) {
		this.adarNum = adarNum;
	}
	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", adarNum=" + adarNum + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public int compareTo(Person p) {
		if(pid>p.pid)
			return 1;
		else if(pid<p.pid)
			return -1;
		else
		 return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 33;
		int result = 1;
		result = prime * result + ((adarNum == null) ? 0 : adarNum.hashCode());
		result = prime * result + pid;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (adarNum == null) {
			if (other.adarNum != null)
				return false;
		} else if (!adarNum.equals(other.adarNum))
			return false;
		if (pid != other.pid)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		return true;
	}
	
	
	

}
