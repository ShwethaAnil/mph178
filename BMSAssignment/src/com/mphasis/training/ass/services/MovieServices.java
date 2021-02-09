package com.mphasis.training.ass.services;

import com.mphasis.training.ass.exceptions.BuisnessException;
import com.mphasis.training.ass.pojos.Movie;

public class MovieServices {
	Movie[] movies=null;
	
	public MovieServices(int size) {
		movies=new Movie[size];
	}
	
	public void addMovie(Movie m,int i)throws BuisnessException {
		if(m.getMname().matches("[A-Z]{2,15}")) {
			if(m.getActor().matches("([A-Z])([a-z]{3,10})")) {
				if(m.getActress().matches("([A-Z])([a-z]{3,10})")){
					if(m.getTickets().matches("[1-9][0-9]")) {
						movies[i]=m;
					}else {
						throw new BuisnessException("Invalid Ticket");
					}
				}else {
					throw new BuisnessException("Invalid actress");
				}
			}else {
				throw new BuisnessException("Invalid Actor name");
			}
		}else {
			throw new BuisnessException("Invalid Movie Name");
		}
	}
	
	
	
	public Movie[] getMovies()throws BuisnessException  {
		try {
			return movies;
		}catch(NullPointerException e) {
			throw new BuisnessException("No Movies");
		}
		
	}

}
