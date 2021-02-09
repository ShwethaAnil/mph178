package com.mphasis.training.pl;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.mphasis.training.pojos.Room;
import com.mphasis.training.pojos.User;
import com.mphasis.training.service.RoomService;
import com.mphasis.training.service.RoomServiceImpl;
import com.mphasis.training.service.UserService;
import com.mphasis.training.service.UserServiceImpl;

public class HotelApp {
	public static void main(String args[]) {
		RoomService rService=new RoomServiceImpl();
		UserService uService=new UserServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Gyo Rooms");
		outer:
		do {
			System.out.println("Enter Username");
			String uname=sc.next();
			System.out.println("Enter Password");
			String pass=sc.next();
			String st=uService.loginUser(uname,pass);
			if(st.equalsIgnoreCase("staff")) {
				inner:
				do {
					System.out.println("1. Add Room \n 2. View Rooms "
							+ "\n 3.View Bookings \n4.Logout");
					switch(sc.nextInt()) {
					case 1: System.out.println("add room details");
					      Room r=new Room(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
					      rService.addRoom(r);
					      System.out.println("room added");
					      break;
					case 2: System.out.println("View Rooms");
					     Set<Room> rooms=rService.getrooms();
					     rooms.forEach(r1-> System.out.println(r1));
					     break;
					case 3: System.out.println("View Booking Details");
					       Map<Room, User> bRooms=
					    		   rService.getBookingRoomDetails();
					        for(Entry<Room, User> bR:bRooms.entrySet()) {
					        System.out.println(bR.getKey()+" "+bR.getValue());
					        }
					        break;
					case 4: System.out.println("Thank you");
							break inner;
					default: System.out.println("invalid");		
					
					}
				}while(true);
			}else if(st.equals("customer")){
				inner:
				do {
				System.out.println("Welcome \n 1. View Rooms 2.Book Room\n 3. Logout");
				switch(sc.nextInt()) {
				case 1: System.out.println("View Rooms");
			     Set<Room> rooms=rService.getrooms();
			     rooms.forEach(r1-> System.out.println(r1));
			     break;
				case 2:
					System.out.println("Enter Which room you want to book");
				 Room r=new Room(sc.nextInt(), sc.next(), sc.nextInt(), 
						sc.next());
					User u=new User(uname,pass,"customer");
					rService.bookRoom(r, u);
					System.out.println("Room is booked");
					break;
				case 3: System.out.println("Thank you");
						break inner;
				default: System.out.println("Invalid Option");		
				}
				}while(true);
			}else {
				System.out.println("Invalid Credentials");
			}
		}while(true);
	}
}
