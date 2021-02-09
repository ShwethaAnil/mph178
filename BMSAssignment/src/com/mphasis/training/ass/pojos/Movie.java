package com.mphasis.training.ass.pojos;

public class Movie {

	private String mname;
	private String actor;
	private String actress;
	private String tickets;
	
	
	public Movie(String mname, String actor, String actress, String tickets) {
		super();
		this.mname = mname;
		this.actor = actor;
		this.actress = actress;
		this.tickets = tickets;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public String getTickets() {
		return tickets;
	}
	public void setTickets(String tickets) {
		this.tickets = tickets;
	}
	
}
