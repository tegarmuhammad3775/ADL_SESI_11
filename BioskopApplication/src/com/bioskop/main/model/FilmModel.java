package com.bioskop.main.model;

/*
 * 
 */
public class FilmModel extends Model {

	private int filmId;
	private String filmName;
	private String category;
	private String subTitle;
	
	public FilmModel() {
		
	}
	
	public FilmModel(int filmId, String filmName, String category, String subTitle) {
		super();
		this.filmId = filmId;
		this.filmName = filmName;
		this.category = category;
		this.subTitle = subTitle;
	}
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	
	
}
