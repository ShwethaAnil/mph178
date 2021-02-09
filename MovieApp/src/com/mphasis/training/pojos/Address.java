package com.mphasis.training.pojos;

public class Address {
	private String dornum;
	private String address,street, city;
	private int pincode;
	
	public Address() {
		
	}
	public Address(String dornum, String address, String street, String city, int pincode) {
		super();
		this.dornum = dornum;
		this.address = address;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public String getDornum() {
		return dornum;
	}
	public void setDornum(String dornum) {
		this.dornum = dornum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
