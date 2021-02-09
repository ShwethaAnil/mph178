package com.mphasis.training.pojos;

public class Movie {

	private int movieId;
	private String movieName;
	private Theater[] theaters=new Theater[5];
	private Actor[] actors=new Actor[4];
	private Crew[] crew=new Crew[4];
	public Movie() {
		
	}
	public Movie(int movieId,String movieName) {
		this.movieId=movieId;
		this.movieName=movieName;
	}
}
