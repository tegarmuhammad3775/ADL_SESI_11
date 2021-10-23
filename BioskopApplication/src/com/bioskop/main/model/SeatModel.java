package com.bioskop.main.model;

public class SeatModel extends Model{
	
	private int seatId;
	private int roomSeatId;
	
	public SeatModel(){
		
	}

	public SeatModel(int seatId, int roomSeatId) {
		super();
		this.seatId = seatId;
		this.roomSeatId = roomSeatId;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public int getRoomSeatId() {
		return roomSeatId;
	}

	public void setRoomSeatId(int roomSeatId) {
		this.roomSeatId = roomSeatId;
	}
	
	

}
