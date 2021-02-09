package com.mphasis.training.ass.view;

import java.util.Scanner;

import com.mphasis.training.ass.exceptions.BuisnessException;
import com.mphasis.training.ass.pojos.Movie;
import com.mphasis.training.ass.services.MovieServices;

public class MovieApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many movies you want to add");
		MovieServices movieService=new MovieServices(sc.nextInt());
		do {
		System.out.println("1. Add Movie \n 2. View Movie \n3.Exit");
		System.out.println("============================");
		switch(sc.nextInt()) {
		case 1:
			System.out.println("Enter the movie name, Actor, Actoress, Tickets");
			Movie movie=new Movie(sc.next(), sc.next(), sc.next(), sc.next());
			System.out.println("enter movie number");
			int i=sc.nextInt();
			try {
			movieService.addMovie(movie,i);
			System.out.println("Movie added");
			}catch(BuisnessException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("============================");
			break;
		case 2: Movie[] movies;
			try {
				movies = movieService.getMovies();
				for(Movie m:movies) {
					System.out.println(m.getMname()+" "+m.getActor()+" "+m.getActress()+" "+m.getTickets());
				}
			} catch (BuisnessException |NullPointerException e) {
				System.out.println(e.getMessage());
			}
				
				System.out.println("============================");
			break;
		case 3: System.out.println("Thank you");
			System.exit(0);
		default: System.out.println("Invalid option");
		}
		}while(true);
		
	}

}
