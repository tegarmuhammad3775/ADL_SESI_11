package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.Model;
import com.bioskop.main.model.RoomModel;
import com.bioskop.main.utility.DatabaseConnection;

public class RoomDaoImplementation implements DaoInterfaces<RoomModel>{
	
	static Connection con = DatabaseConnection.getConnection();
	
	@Override
	public int add(RoomModel model) throws SQLException {
		String query = "insert into room(maxof_seat) values (?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getMaxOfSeat());
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public void delete(RoomModel model) throws SQLException {
		String query="delete from room where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getRoomId());
		ps.executeUpdate();
		
	}

	@Override
	public void delete(int id) throws SQLException {
		String query="delete from room where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();	
	}

	@Override
	public void update(RoomModel model) throws SQLException {
		String query="update room set maxof_seat = ? where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);	
		ps.setInt(1, model.getRoomId());
		ps.setInt(2, model.getMaxOfSeat());
		ps.executeUpdate();
	}

	@Override
	public Model getById(RoomModel model) throws SQLException {
		String query="select * from room where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getRoomId());
		ResultSet rs = ps.executeQuery();
		
		RoomModel roomModel = new RoomModel();
		while(rs.next()){
			roomModel.setRoomId(rs.getInt("room_id"));
			roomModel.setMaxOfSeat(rs.getInt("maxof_seat"));
		}
		
		return roomModel;
	}

	@Override
	public Model getById(int id) throws SQLException {
		String query="select * from room where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		RoomModel roomModel = new RoomModel();
		while(rs.next()){
			roomModel.setRoomId(rs.getInt("room_id"));
			roomModel.setMaxOfSeat(rs.getInt("maxof_seat"));
		}
		
		return roomModel;
	}

	@Override
	public List<RoomModel> getAll() throws SQLException {
		String query="select * from room";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		List<RoomModel> listRoom = new ArrayList<RoomModel>();
		
		while(rs.next()){
			RoomModel roomModel = new RoomModel();
			roomModel.setRoomId(rs.getInt("room_id"));
			roomModel.setMaxOfSeat(rs.getInt("maxof_seat"));
			listRoom.add(roomModel);
		}

		return (listRoom);
	}

}
