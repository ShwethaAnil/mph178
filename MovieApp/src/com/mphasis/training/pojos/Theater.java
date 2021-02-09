package com.mphasis.training.pojos;

import java.time.LocalDateTime;

public class Theater {
	private int theaterId;
	private String name;
	private LocalDateTime movieTime;
	private Address address=new Address();
	
	public Theater() {
		
	}
	
	public Theater(int theaterId, String name, LocalDateTime movieTime, Address address) {
		super();
		this.theaterId = theaterId;
		this.name = name;
		this.movieTime = movieTime;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(LocalDateTime movieTime) {
		this.movieTime = movieTime;
	}
	
	

}
