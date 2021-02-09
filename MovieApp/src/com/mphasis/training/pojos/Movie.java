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
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Theater[] getTheaters() {
		return theaters;
	}
	public void setTheaters(Theater[] theaters) {
		this.theaters = theaters;
	}
	public Actor[] getActors() {
		return actors;
	}
	public void setActors(Actor[] actors) {
		this.actors = actors;
	}
	public Crew[] getCrew() {
		return crew;
	}
	public void setCrew(Crew[] crew) {
		this.crew = crew;
	}
	
}
