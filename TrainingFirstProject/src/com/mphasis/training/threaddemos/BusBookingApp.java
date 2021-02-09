package com.mphasis.training.threaddemos;

public class BusBookingApp {

	public static void main(String[] args) {
		Bus mBus=new Bus();
		Passenger p1=new Passenger(8, mBus, "Sarika");
		Passenger p2=new Passenger(9, mBus, "Ashritha");
		p1.start();
		p2.start();

	}

}
