package com.mphasis.training.pojos;

public class Crew {
	private String firstName;
	private String lastName;
	private String wiki;
	public Crew() {
		
	}
	public Crew(String firstName, String lastName, String wiki) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.wiki = wiki;
	}
	@Override
	public String toString() {
		return "Crew [firstName=" + firstName + ", lastName=" + lastName + ", wiki=" + wiki + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getWiki() {
		return wiki;
	}
	public void setWiki(String wiki) {
		this.wiki = wiki;
	}

}
