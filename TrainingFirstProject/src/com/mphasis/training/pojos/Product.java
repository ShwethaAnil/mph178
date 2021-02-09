package com.mphasis.training.pojos;

public class Product implements Comparable<Product>{
	private int pid;
	private String pname;
	private int qty;
	private String brand;
	private double cost;
	public Product(int pid, String pname, int qty, String brand, double cost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.brand = brand;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", brand=" + brand + ", cost=" + cost
				;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + pid;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		result = prime * result + qty;
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
		Product other = (Product) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (pid != other.pid)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (qty != other.qty)
			return false;
		return true;
	}
	@Override
	public int compareTo(Product p) {
		if(pid>p.pid)
			return 1;
		else if(pid<p.pid)
			return -1;
		else
			return 0;
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public int getQty() {
		return qty;
	}
	public String getBrand() {
		return brand;
	}
	public double getCost() {
		return cost;
	}
	
	

}
