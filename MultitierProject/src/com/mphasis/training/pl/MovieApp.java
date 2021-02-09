package com.mphasis.training.pl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.mphasis.training.exceptions.BuisnessException;
import com.mphasis.training.pojos.Movie;
import com.mphasis.training.services.MovieService;

public class MovieApp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	MovieService mService=new MovieService();
		Movie m=new Movie(sc.next(), sc.next(), sc.next(), sc.next());
		Movie[] movies=new Movie[1];
		try {
		boolean status=mService.addMovie(m);
		if(status) {
			System.out.println("movie added");
			movies[0]=m;
			try {
			FileOutputStream fos=new FileOutputStream("movie.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(m);
			oos.flush();
			fos.flush();
			oos.close();
			fos.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		}catch(BuisnessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
