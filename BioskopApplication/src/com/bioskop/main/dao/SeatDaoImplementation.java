package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.Model;
import com.bioskop.main.model.SeatModel;
import com.bioskop.main.utility.DatabaseConnection;

public class SeatDaoImplementation implements DaoInterfaces<SeatModel>{
	
	static Connection con = DatabaseConnection.getConnection();

	@Override
	public int add(SeatModel model) throws SQLException {
		String query = "insert into seat(room_seat_id) values (?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getRoomSeatId());
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public void delete(SeatModel model) throws SQLException {
		String query="delete from seat where seat_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getSeatId());
		ps.executeUpdate();
		
	}

	@Override
	public void delete(int id) throws SQLException {
		String query="delete from seat where seat_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	@Override
	public void update(SeatModel model) throws SQLException {
		String query="update seat set room_seat_id = ? where seat_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getRoomSeatId());
		ps.setInt(2, model.getSeatId());
		ps.executeUpdate();
	}

	@Override
	public Model getById(SeatModel model) throws SQLException {
		String query="select * from seat where seat_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getSeatId());
		ResultSet rs = ps.executeQuery();
		
		SeatModel seatModel = new SeatModel();
		
		while(rs.next()){
			seatModel.setSeatId(rs.getInt("seat_id"));
			seatModel.setRoomSeatId(rs.getInt("room_seat_id"));
		}
		
		return seatModel;
	}

	@Override
	public Model getById(int id) throws SQLException {
		String query="select * from seat where seat_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		SeatModel seatModel = new SeatModel();
		
		while(rs.next()){
			seatModel.setSeatId(rs.getInt("seat_id"));
			seatModel.setRoomSeatId(rs.getInt("room_seat_id"));
		}
		
		return seatModel;
	}

	@Override
	public List<SeatModel> getAll() throws SQLException {
		String query="select * from seat";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		List<SeatModel> listSeat = new ArrayList<SeatModel>();
		
		while(rs.next()){
			SeatModel seatModel = new SeatModel();
			seatModel.setSeatId(rs.getInt("seat_id"));
			seatModel.setRoomSeatId(rs.getInt("room_seat_id"));
			listSeat.add(seatModel);
		}
		
		return (listSeat);
	}

}
