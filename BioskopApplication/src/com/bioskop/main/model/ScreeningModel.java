package com.bioskop.main.model;

import java.sql.Date;


public class ScreeningModel extends Model{
	
	private int screeningId;
	private int filmId;
	private int roomId;
	private Date screeningDate;
	private int price;
	
	public ScreeningModel() {
		
	}

	public ScreeningModel(int screeningId, int filmId, int roomId, Date screeningDate, int price) {
		super();
		this.screeningId = screeningId;
		this.filmId = filmId;
		this.roomId = roomId;
		this.screeningDate = screeningDate;
		this.price = price;
	}

	public int getScreeningId() {
		return screeningId;
	}

	public void setScreeningId(int screeningId) {
		this.screeningId = screeningId;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public Date getScreeningDate() {
		return screeningDate;
	}

	public void setScreeningDate(Date screeningDate) {
		this.screeningDate = screeningDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
