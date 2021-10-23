package com.bioskop.main.model;

public class RoomModel extends Model{
	
	private int roomId;
	private int maxOfSeat;
	
	public RoomModel() {
		
	}

	public RoomModel(int roomId, int maxOfSeat) {
		super();
		this.roomId = roomId;
		this.maxOfSeat = maxOfSeat;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getMaxOfSeat() {
		return maxOfSeat;
	}

	public void setMaxOfSeat(int maxOfSeat) {
		this.maxOfSeat = maxOfSeat;
	}
	

}
