package com.mphasis.training.services;

import com.mphasis.training.exceptions.BuisnessException;
import com.mphasis.training.pojos.Movie;

public class MovieService {
	
	public boolean addMovie(Movie m)throws BuisnessException {
		if(m.getName().matches("[A-Z]{1,15}")) {
			if(m.getActor().matches("[A-Z][a-z]{2,10}")) {
				return true;
			}else {
				throw new BuisnessException("inavlid actor");
			}
		}else {
			throw new BuisnessException("Invalid movie name");
		}
		
	}

}
