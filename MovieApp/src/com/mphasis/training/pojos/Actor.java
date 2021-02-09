package com.mphasis.training.pojos;

public class Actor {
	private String firstName;
	private String lastName;
	private String wiki;
	
	public Actor() {
		
	}
	

	public Actor(String firstName, String lastName, String wiki) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.wiki = wiki;
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
