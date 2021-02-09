package com.mphasis.training.pojos;

import java.io.Serializable;

public class Movie  implements Serializable{
	private String name, actor,actress, ticket;

	public Movie(String name, String actor, String actress, String ticket) {
		super();
		this.name = name;
		this.actor = actor;
		this.actress = actress;
		this.ticket = ticket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

}
