package com.mphasis.training.service;


import java.util.Map;
import java.util.Set;

import com.mphasis.training.pojos.Room;
import com.mphasis.training.pojos.User;

public interface RoomService {

	public Set<Room> getrooms();
	public void addRoom(Room room);
	public void bookRoom(Room r,User u);
	public Map<Room, User> getBookingRoomDetails();
}
