package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.CustomerModel;
import com.bioskop.main.model.Model;
import com.bioskop.main.utility.DatabaseConnection;

public class CustomerDaoImplementation implements DaoInterfaces<CustomerModel> {
	
	static Connection con = DatabaseConnection.getConnection();

	
	@Override
	public int add(CustomerModel model) throws SQLException {
		String query = "insert into customer(first_name, last_name, no_hp, address, email, birthdate) values (?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, model.getFirstName());
		ps.setString(2, model.getLastName());
		ps.setString(3, model.getNoHP());
		ps.setString(4, model.getAddress());
		ps.setString(5, model.getEmail());
		ps.setDate(6, model.getBirthdate());
		int result = ps.executeUpdate();
		
		return result;
	}

	@Override
	public void delete(CustomerModel model) throws SQLException {
		String query="delete from customer where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getCustomerId());
		ps.executeUpdate();
	}

	@Override
	public void delete(int id) throws SQLException {
		String query="delete from customer where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	@Override
	public void update(CustomerModel model) throws SQLException {
		String query="update customer set first_name = ?, last_name = ?, no_hp = ?, address = ?, email = ?, birthdate = ? where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, model.getFirstName());
		ps.setString(2, model.getLastName());
		ps.setString(3, model.getNoHP());
		ps.setString(4, model.getAddress());
		ps.setString(5, model.getEmail());
		ps.setDate(6, model.getBirthdate());
		ps.setInt(7, model.getCustomerId());
		ps.executeUpdate();
	}

	@Override
	public Model getById(CustomerModel model) throws SQLException {
		String query="select * from customer where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, model.getCustomerId());
		ResultSet rs = ps.executeQuery();
		
		CustomerModel customerModel = new CustomerModel();
		
		while(rs.next()){
			customerModel.setCustomerId(rs.getInt("customer_id"));
			customerModel.setFirstName(rs.getString("first_name"));
			customerModel.setLastName(rs.getString("last_name"));
			customerModel.setNoHP(rs.getString("no_hp"));
			customerModel.setAddress(rs.getString("address"));
			customerModel.setEmail(rs.getString("email"));
			customerModel.setBirthdate(rs.getDate("birthdate"));
		}
		
		return customerModel;
	}

	@Override
	public Model getById(int id) throws SQLException {
		String query="select * from customer where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		CustomerModel customerModel = new CustomerModel();
		
		while(rs.next()){
			customerModel.setCustomerId(rs.getInt("customer_id"));
			customerModel.setFirstName(rs.getString("first_name"));
			customerModel.setLastName(rs.getString("last_name"));
			customerModel.setNoHP(rs.getString("no_hp"));
			customerModel.setAddress(rs.getString("address"));
			customerModel.setEmail(rs.getString("email"));
			customerModel.setBirthdate(rs.getDate("birthdate"));
		}
		
		return customerModel;
	}

	@Override
	public List<CustomerModel> getAll() throws SQLException {
		String query="select * from customer";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		List<CustomerModel> listCustomer = new ArrayList<CustomerModel>();
		
		while(rs.next()){
			CustomerModel customerModel = new CustomerModel();
			customerModel.setFirstName(rs.getString("first_name"));
			customerModel.setLastName(rs.getString("last_name"));
			customerModel.setNoHP(rs.getString("no_hp"));
			customerModel.setAddress(rs.getString("address"));
			customerModel.setEmail(rs.getString("email"));
			customerModel.setBirthdate(rs.getDate("birthdate"));
			listCustomer.add(customerModel);
		}
		
		return (listCustomer);
	}

}
