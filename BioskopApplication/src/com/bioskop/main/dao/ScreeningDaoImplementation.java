package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.Model;
import com.bioskop.main.model.ScreeningModel;
import com.bioskop.main.utility.DatabaseConnection;

public class ScreeningDaoImplementation implements DaoInterfaces<ScreeningModel> {

	static Connection con = DatabaseConnection.getConnection();

	@Override
	public int add(ScreeningModel model) throws SQLException {
		String query = "insert into screening(film_id, room_id, screening_date, price) values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getFilmId());
		ps.setInt(2, model.getRoomId());
		ps.setDate(3, model.getScreeningDate());
		ps.setInt(4, model.getPrice());
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public void delete(ScreeningModel model) throws SQLException {
		String query="delete from screening where screening_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getScreeningId());
		ps.executeUpdate();
	}

	@Override
	public void delete(int id) throws SQLException {
		String query="delete from screening where screening_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	@Override
	public void update(ScreeningModel model) throws SQLException {
		String query="update screening set film_id = ?, room_id = ?, screening_date = ?, price = ? where screening_id = ?";
		PreparedStatement ps = con.prepareStatement(query);		
		ps.setInt(1, model.getFilmId());
		ps.setInt(2, model.getRoomId());
		ps.setDate(3, model.getScreeningDate());
		ps.setInt(4, model.getPrice());
		ps.setInt(5, model.getScreeningId());
	}

	@Override
	public Model getById(ScreeningModel model) throws SQLException {
		String query="select * from screening where screening_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getScreeningId());
		ResultSet rs = ps.executeQuery();
		
		ScreeningModel screeningModel = new ScreeningModel();
		
		while(rs.next()){
			screeningModel.setScreeningId(rs.getInt("screening_id"));
			screeningModel.setFilmId(rs.getInt("film_id"));
			screeningModel.setRoomId(rs.getInt("room_id"));
			screeningModel.setScreeningDate(rs.getDate("screening_date"));
			screeningModel.setPrice(rs.getInt("price"));
		}
		
		return screeningModel;
	}

	@Override
	public Model getById(int id) throws SQLException {
		String query="select * from screening where screening_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		ScreeningModel screeningModel = new ScreeningModel();
		
		while(rs.next()){
			screeningModel.setScreeningId(rs.getInt("screening_id"));
			screeningModel.setFilmId(rs.getInt("film_id"));
			screeningModel.setRoomId(rs.getInt("room_id"));
			screeningModel.setScreeningDate(rs.getDate("screening_date"));
			screeningModel.setPrice(rs.getInt("price"));
		}
		
		return screeningModel;
	}

	@Override
	public List<ScreeningModel> getAll() throws SQLException {
		String query="select * from Screening";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		List<ScreeningModel> listScreening = new ArrayList<ScreeningModel>();
		
		while(rs.next()){
			ScreeningModel screeningModel = new ScreeningModel();
			screeningModel.setScreeningId(rs.getInt("screening_id"));
			screeningModel.setFilmId(rs.getInt("film_id"));
			screeningModel.setRoomId(rs.getInt("room_id"));
			screeningModel.setScreeningDate(rs.getDate("screening_date"));
			screeningModel.setPrice(rs.getInt("price"));
			listScreening.add(screeningModel);
		}
		
		return (listScreening);
	}
	
	
}
