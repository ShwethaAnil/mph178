package com.mphasis.training.threaddemos;

public class Bus implements Runnable{
	private int totalSeatsAvailable=10;
	
 public int getTotalSeatsAvailable() {
		return totalSeatsAvailable;
	}
 
 public boolean bookTicket(int seats, String name) {
	 System.out.println("Welcome to Mphasis Bus "
			 +Thread.currentThread().getName()+
			 "Number of available tickets"
			 +this.getTotalSeatsAvailable());
	 
	 if(seats>this.getTotalSeatsAvailable()) {
		 return false;
	 }else {
		 totalSeatsAvailable =totalSeatsAvailable-seats;
		 return true;
	 }
 }

	@Override
	public void run() {
		Passenger pt=(Passenger)Thread.currentThread();
		boolean ticketsBooked=
				this.bookTicket(pt.getSeatsNeeded(),
						pt.getName());
		if(ticketsBooked==true) {
			System.out.println("Congrats "
					+Thread.currentThread().getName()+
					" seats booked"+pt.getSeatsNeeded());
		}else {
			System.out.println("Sorry "
		+Thread.currentThread().getName()
		+" seats not booked"+pt.getSeatsNeeded());
		}
		
	}

}
