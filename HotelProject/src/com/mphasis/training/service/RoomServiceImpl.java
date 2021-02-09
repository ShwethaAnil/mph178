package com.mphasis.training.service;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.mphasis.training.pojos.Room;
import com.mphasis.training.pojos.User;

public class RoomServiceImpl implements RoomService {
static Set<Room> rooms=new TreeSet<Room>();
	
	static{
		rooms.add(new Room(101, "AC", 2, "Vaccant"));
		rooms.add(new Room(102, "NonAC", 1, "Occupied"));
		rooms.add(new Room(103, "AC", 2, "Vaccant"));
		rooms.add(new Room(104, "AC", 1, "Occupied"));
	}
	@Override
	public Set<Room> getrooms() {
		// TODO Auto-generated method stub
		return rooms;
	}

	@Override
	public void addRoom(Room room) {
		// TODO Auto-generated method stub
		rooms.add(room);
	}
	Map<Room,User> bookingRooms=new Hashtable<Room, User>();
	public void bookRoom(Room r,User u) {
		bookingRooms.put(r,u);
	}
	
	public Map<Room, User> getBookingRoomDetails(){
		return bookingRooms;
	}
	
	public void updateRoomStatus(Room r,String status) {
	//	for(Room ro:rooms) {
			if(rooms.contains(r)) {
				r.setStatus("Occupied");
		//	}
		}
		
	}

}
