package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.BookingModel;
import com.bioskop.main.model.Model;
import com.bioskop.main.utility.DatabaseConnection;

public class BookingDaoImplementation implements DaoInterfaces<BookingModel>  {
	
	static Connection con = DatabaseConnection.getConnection();
	
	@Override
	public int add(BookingModel model) throws SQLException {
		String query = "insert into booking(booking_id,seat_id,screening_id,customer_id) values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getBookingId());
		ps.setInt(2, model.getSeatId());
		ps.setInt(3, model.getScreeningId());
		ps.setInt(4, model.getCustomerId());
		int result = ps.executeUpdate();
		
		return result;
	}

	@Override
	public void delete(BookingModel model) throws SQLException {
		String query="delete from booking where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getBookingId());
		ps.executeUpdate();
	}

	@Override
	public void delete(int id) throws SQLException {
		String query="delete from booking where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	@Override
	public void update(BookingModel model) throws SQLException {
		String query="update booking set seat_id = ?, screening_id = ?,  customer_id = ? where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getSeatId());
		ps.setInt(2, model.getScreeningId());
		ps.setInt(3, model.getCustomerId());
		ps.setInt(4, model.getBookingId());
		ps.executeUpdate();
	}

	@Override
	public Model getById(BookingModel model) throws SQLException {
		String query="select * from booking where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getBookingId());
		ResultSet rs = ps.executeQuery();
		
		BookingModel bookingModel = new BookingModel();
		while(rs.next()) {
			bookingModel.setBookingId(rs.getInt("booking_id"));
			bookingModel.setSeatId(rs.getInt("seat_id"));
			bookingModel.setScreeningId(rs.getInt("screening_id"));
			bookingModel.setCustomerId(rs.getInt("customer_id"));
		}
		
		return bookingModel;
	}

	@Override
	public Model getById(int id) throws SQLException {
		String query="select * from booking where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		BookingModel bookingModel = new BookingModel();
		while(rs.next()) {
			bookingModel.setBookingId(rs.getInt("booking_id"));
			bookingModel.setSeatId(rs.getInt("seat_id"));
			bookingModel.setScreeningId(rs.getInt("screening_id"));
			bookingModel.setCustomerId(rs.getInt("customer_id"));
		}
		
		return bookingModel;
	}

	@Override
	public List<BookingModel> getAll() throws SQLException {
		String query="select * from Booking";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		List<BookingModel> listBooking = new ArrayList<BookingModel>();
		
		while(rs.next()){
			BookingModel bookingModel = new BookingModel();
			bookingModel.setBookingId(rs.getInt("booking_id"));
			bookingModel.setSeatId(rs.getInt("seat_id"));
			bookingModel.setScreeningId(rs.getInt("screening_id"));
			bookingModel.setCustomerId(rs.getInt("customer_id"));
			listBooking.add(bookingModel);
		}
		
		return (listBooking);
	}

}
