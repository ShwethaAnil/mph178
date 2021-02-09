package com.mphasis.training.pojos;


public class Room implements Comparable<Room> {
private int roomNum;
private String roomType;
private int accomdate;
private String status;
public Room(int roomNum, String roomType, int accomdate, String status) {
	super();
	this.roomNum = roomNum;
	this.roomType = roomType;
	this.accomdate = accomdate;
	this.status = status;
}
public int getRoomNum() {
	return roomNum;
}
public void setRoomNum(int roomNum) {
	this.roomNum = roomNum;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
public int getAccomdate() {
	return accomdate;
}
public void setAccomdate(int accomdate) {
	this.accomdate = accomdate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


@Override
public String toString() {
	return  roomNum + "," + roomType + " ," + accomdate + ", " + status
			;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + accomdate;
	result = prime * result + roomNum;
	result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Room other = (Room) obj;
	if (accomdate != other.accomdate)
		return false;
	if (roomNum != other.roomNum)
		return false;
	if (roomType == null) {
		if (other.roomType != null)
			return false;
	} else if (!roomType.equals(other.roomType))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	return true;
}
@Override
public int compareTo(Room o) {
	// TODO Auto-generated method stub
	return roomNum-o.roomNum;
}

}
