package com.bioskop.main.model;

public class BookingModel extends Model {
	private int bookingId;
	private int seatId;
	private int screeningId;
	private int customerId;
 
	public BookingModel(){
		 
	}	

	public BookingModel(int bookingId, int seatId, int screeningId, int customerId) {
		super();
		this.bookingId = bookingId;
		this.seatId = seatId;
		this.screeningId = screeningId;
		this.customerId = customerId;
	}

	public int getBookingId() {
		return bookingId;
	}
	
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
	public int getSeatId() {
		return seatId;
	}
	
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	
	public int getScreeningId() {
		return screeningId;
	}
	
	public void setScreeningId(int screeningId) {
		this.screeningId = screeningId;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	 
}
