package com.mphasis.training.pojos;

import java.time.LocalDateTime;

public class Theater {
	private int theaterId;
	private String name;
	private LocalDateTime movieTime;
	private Address address=new Address();
	public Theater() {
		
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
