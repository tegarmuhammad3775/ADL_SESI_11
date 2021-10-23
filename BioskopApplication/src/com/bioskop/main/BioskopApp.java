package com.bioskop.main;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.bioskop.main.dao.BookingDaoImplementation;
import com.bioskop.main.dao.CustomerDaoImplementation;
import com.bioskop.main.dao.FilmDaoImplementation;
import com.bioskop.main.dao.RoomDaoImplementation;
import com.bioskop.main.dao.ScreeningDaoImplementation;
import com.bioskop.main.dao.SeatDaoImplementation;
import com.bioskop.main.model.BookingModel;
import com.bioskop.main.model.CustomerModel;
import com.bioskop.main.model.FilmModel;
import com.bioskop.main.model.RoomModel;
import com.bioskop.main.model.ScreeningModel;
import com.bioskop.main.model.SeatModel;

public class BioskopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		   
		    /*--Table Film--*/
			FilmDaoImplementation filmDao = new FilmDaoImplementation();
			System.out.println("-----Tabel Film-----");
			
		    /*Get All Film*/
		    System.out.println("Get All Film : ");
		    List<FilmModel> listFilm = filmDao.getAll();	    
		    for (FilmModel filmModel : listFilm) {
				System.out.print(filmModel.getFilmId()+" | "+filmModel.getFilmName()+" | "+filmModel.getCategory()+" | "+filmModel.getSubTitle());
				System.out.println();
			}
		    
		    /*Get Film by ID*/
		    System.out.println("Get Film by ID: ");
		    FilmModel film1 = (FilmModel) filmDao.getById(1);
		    System.out.println(film1.getFilmId()+" | "+film1.getFilmName()+" | "+film1.getCategory()+" | "+film1.getSubTitle());
		    
		    /*Add Film*/
		    System.out.println("Add Film: ");
		    FilmModel film = new FilmModel();
		    film.setFilmName("Beranak dalam Kardus");
		    film.setCategory("Horror");
		    film.setSubTitle("Sunda");
		    //filmDao.add(film);
		    System.out.println("Film telah behasil ditambahkan");
		    
		    /*Delete Film*/
		    System.out.println("Delete Film: ");
		    int filmDelete = 15;
		    filmDao.delete(filmDelete);
		    System.out.println("Film dengan ID = "+ filmDelete +" telah behasil dihapus");
		    
		    /*Update Film*/
		    System.out.println("Update Film: ");
		    String newFilmName = "Suzanna";
		    String newCategory =  "Thriler";
		    String newSubTitle = "Germany";
		    int filmId = 16;
		    FilmModel updateFilm = new FilmModel();
		    updateFilm.setFilmName(newFilmName);
		    updateFilm.setCategory(newCategory);
		    updateFilm.setSubTitle(newSubTitle);
		    updateFilm.setFilmId(filmId);
		    filmDao.update(updateFilm);
		    System.out.println("Film dengan ID = "+ filmId +" telah behasil diperbaharui");
		    
		    System.out.println();
		    
		    
		    
		    
		    
	
		    /*--Table Customer--*/
		    CustomerDaoImplementation customerDao = new CustomerDaoImplementation();
		    System.out.println("-----Tabel Customer-----");
		    
		    /*Get All Customer*/
		    System.out.println("Get All Customer : ");
		    List<CustomerModel> listCustomer = customerDao.getAll();	    
		    for (CustomerModel customerModel : listCustomer) {
				System.out.print(customerModel.getCustomerId() + " " + customerModel.getFirstName() + " " + customerModel.getLastName() + " " +
		                         customerModel.getNoHP() + " " +customerModel.getAddress() + " " + customerModel.getBirthdate());
				System.out.println();
			}
		    
		    /*Get Customer by ID*/
		    System.out.println("Get Customer by ID: ");
		    CustomerModel customer1 = (CustomerModel) customerDao.getById(1);
		    System.out.println(customer1.getCustomerId()+" "+customer1.getFirstName()+" "+customer1.getLastName()+" "+customer1.getNoHP()+ " " +
		                       customer1.getAddress()+" "+customer1.getBirthdate());
		    
		    /*Add Customer*/
		    System.out.println("Add Customer: ");
		    CustomerModel customerAdd = new CustomerModel();
		    customerAdd.setFirstName("Adi");
		    customerAdd.setLastName("Permana");
		    customerAdd.setNoHP("08145672348");
		    customerAdd.setAddress("Jl. Cemara II No.2C");
		    customerAdd.setEmail("adipermana@gmail.com");
		    customerAdd.setBirthdate(Date.valueOf("1988-10-11"));
		    //customerDao.add(customerAdd);
		    System.out.println("Customer telah behasil ditambahkan");
		    
		    /*Delete Customer*/
		    System.out.println("Delete Customer: ");
		    int customerDelete = 4;
		    customerDao.delete(customerDelete);
		    System.out.println("Customer dengan ID = "+ customerDelete +" telah behasil dihapus");
		    
		    /*Update Customer*/
		    System.out.println("Update Customer: ");
		    String newFirstName = "Tedi";
		    String newLastName =  "Rukmana";
		    String newNoHP = "08765423913";
		    String newAddress = "Jl. Kecubung No.8F";
		    String newEmail = "tedirukmana@yahoo.com";
		    Date newBirhDAte = Date.valueOf("1989-11-12");
		    int customerId = 6;
		    CustomerModel updateCustomer = new CustomerModel();
		    updateCustomer.setFirstName(newFirstName);
		    updateCustomer.setLastName(newLastName);
		    updateCustomer.setNoHP(newNoHP);
		    updateCustomer.setAddress(newAddress);
		    updateCustomer.setEmail(newEmail);
		    updateCustomer.setBirthdate(newBirhDAte);
		    updateCustomer.setCustomerId(customerId);
		    customerDao.update(updateCustomer);
		    System.out.println("Customer dengan ID = "+ customerId +" telah behasil diperbaharui");

		    System.out.println();
		    
		    
		    
		    
		    
		    
		    
		    /*--Table Booking--*/
			BookingDaoImplementation bookingDao = new BookingDaoImplementation();
			System.out.println("-----Tabel Booking-----");
			
			/*Get All Booking*/
		    System.out.println("Get All Booking : ");
		    List<BookingModel> listBooking = bookingDao.getAll();	    
		    for (BookingModel bookingModel : listBooking) {
				System.out.print(bookingModel.getBookingId()+" "+bookingModel.getSeatId()+" "+bookingModel.getScreeningId()+" "+bookingModel.getCustomerId());
				System.out.println();
			}
		    
		    /*Get Booking by ID*/
		    System.out.println("Get Booking by ID: ");
		    BookingModel booking1 = (BookingModel) bookingDao.getById(2);
		    System.out.println(booking1.getBookingId()+" "+booking1.getSeatId()+" "+booking1.getScreeningId()+" "+booking1.getCustomerId());
		    
		    /*Add Booking*/
		    System.out.println("Add Booking: ");
		    BookingModel bookingAdd = new BookingModel();
		    bookingAdd.setSeatId(2);
		    bookingAdd.setScreeningId(2);
		    bookingAdd.setCustomerId(2);
		    //bookingDao.add(bookingAdd);
		    System.out.println("Booking telah behasil ditambahkan");
		    
		    /*Delete Booking*/
		    System.out.println("Delete Booking: ");
		    int bookingDelete = 8;
		    bookingDao.delete(bookingDelete);
		    System.out.println("Booking dengan ID = "+ bookingDelete +" telah behasil dihapus");
		    
		    /*Update Booking*/
		    System.out.println("Update Booking: ");
		    int newSeatIdBooking = 1;
		    int newScreeningIdBooking = 1;
		    int newCustomerIdBooking = 2;
		   
		    int bookingId = 6;
		    BookingModel updateBooking = new BookingModel();
		    updateBooking.setSeatId(newSeatIdBooking);
		    updateBooking.setScreeningId(newScreeningIdBooking);
		    updateBooking.setCustomerId(newCustomerIdBooking);
		    updateBooking.setBookingId(bookingId);
		    bookingDao.update(updateBooking);
		    System.out.println("Booking dengan ID = "+ bookingId +" telah behasil diperbaharui");
		    
		    System.out.println();
		    
		    
		    
		    
		    
		    
		    
		    /*--Table Room--*/
		    RoomDaoImplementation roomDao = new RoomDaoImplementation();
		    System.out.println("-----Tabel Room-----");
		    
		    /*Get All Room*/
		    System.out.println("Get All Room : ");
		    List<RoomModel> listRoom = roomDao.getAll();	    
		    for (RoomModel roomModel : listRoom) {
				System.out.print(roomModel.getRoomId()+" "+roomModel.getMaxOfSeat());
				System.out.println();
			}
		    
		    /*Get Room by ID*/
		    System.out.println("Get Room by ID: ");
		    RoomModel room1 = (RoomModel) roomDao.getById(2);
		    System.out.println(room1.getRoomId()+" "+room1.getMaxOfSeat());
		    
		    /*Add Room*/
		    System.out.println("Add Room: ");
		    RoomModel roomAdd = new RoomModel();
		    roomAdd.setMaxOfSeat(25);
		    //roomDao.add(roomAdd);
		    System.out.println("Room telah behasil ditambahkan");
		    
		    /*Delete Room*/
		    System.out.println("Delete Room: ");
		    int roomDelete = 3;
		    roomDao.delete(roomDelete);
		    System.out.println("Room dengan ID = "+ roomDelete +" telah behasil dihapus");
		    
		    /*Update Room*/
		    System.out.println("Update Room: ");
		    int newMaxOfSeat = 20;
		   
		    int roomId = 4;
		    RoomModel updateRoom = new RoomModel();
		    updateRoom.setMaxOfSeat(newMaxOfSeat);
		    updateRoom.setRoomId(roomId);
		    roomDao.update(updateRoom);
		    System.out.println("Room dengan ID = "+ roomId +" telah behasil diperbaharui");
		    
		    System.out.println();
		    
		    
		    
		    
		    
		    
		    
		    /*--Table Screening--*/
		    ScreeningDaoImplementation screeningDao = new ScreeningDaoImplementation();
		    System.out.println("-----Tabel Screening-----");
		    
		    /*Get All Screening*/
		    System.out.println("Get All Screening : ");
		    List<ScreeningModel> listScreening = screeningDao.getAll();	    
		    for (ScreeningModel screeningModel : listScreening) {
				System.out.print(screeningModel.getScreeningId()+" "+screeningModel.getFilmId()+" "+screeningModel.getRoomId()+" "+ screeningModel.getScreeningDate()+" "+ screeningModel.getPrice());
				System.out.println();
			}
		    
		    /*Get Screening by ID*/
		    System.out.println("Get Screening by ID: ");
		    ScreeningModel screening1 = (ScreeningModel) screeningDao.getById(1);
		    System.out.println(screening1.getScreeningId()+" "+screening1.getFilmId()+" "+screening1.getRoomId()+" "+screening1.getScreeningDate()+" "+screening1.getPrice());
		    
		    /*Add Screening*/
		    System.out.println("Add Screening: ");
		    ScreeningModel screeningAdd = new ScreeningModel();
		    screeningAdd.setFilmId(2);
		    screeningAdd.setRoomId(2);
		    screeningAdd.setScreeningDate(Date.valueOf("2021-11-11"));
		    //screeningAdd.setPrice(35000);
		    screeningDao.add(screeningAdd);
		    System.out.println("Screening telah behasil ditambahkan");
		    
		    /*Delete Screening*/
		    System.out.println("Delete Screening: ");
		    int screeningDelete = 5;
		    screeningDao.delete(screeningDelete);
		    System.out.println("Screening dengan ID = "+ screeningDelete +" telah behasil dihapus");
		    
		    /*Update Screening*/
		    System.out.println("Update Screening: ");
		    int newFilmId = 2;
		    int newRoomId = 2;
		    Date newScreenDate = Date.valueOf("2021-11-12");
		    int newPrice = 27000;
		   
		    int screeningId = 6;
		    ScreeningModel updateScreening = new ScreeningModel();
		    updateScreening.setFilmId(newFilmId);
		    updateScreening.setRoomId(newRoomId);
		    updateScreening.setScreeningDate(newScreenDate);
		    updateScreening.setPrice(newPrice);
		    updateScreening.setScreeningId(screeningId);
		    
		    screeningDao.update(updateScreening);
		    System.out.println("Screening dengan ID = "+ screeningId +" telah behasil diperbaharui");
		    
		    System.out.println();
		    
		    
		    
		    
		    
		    
		    
		    
		    /*--Table Seat--*/
		    SeatDaoImplementation seatDao = new SeatDaoImplementation();
		    System.out.println("-----Tabel Seat-----");
		    
		    /*Get All Seat*/
		    System.out.println("Get All Seat : ");
		    List<SeatModel> listSeat = seatDao.getAll();	    
		    for (SeatModel seatModel : listSeat) {
				System.out.print(seatModel.getSeatId()+" "+seatModel.getRoomSeatId());
				System.out.println();
			}
		    
		    /*Get Seat by ID*/
		    System.out.println("Get Seat by ID: ");
		    SeatModel seat1 = (SeatModel) seatDao.getById(2);
		    System.out.println(seat1.getSeatId()+" "+seat1.getRoomSeatId());
		    
		    /*Add Seat*/
		    System.out.println("Add Seat: ");
		    SeatModel seatAdd = new SeatModel();
		    seatAdd.setRoomSeatId(4);
		    //seatDao.add(seatAdd);
		    System.out.println("Seat telah behasil ditambahkan");
		    
		    /*Delete Seat*/
		    System.out.println("Delete Seat: ");
		    int seatDelete = 3;
		    seatDao.delete(seatDelete);
		    System.out.println("Seat dengan ID = "+ seatDelete +" telah behasil dihapus");

		    /*Update Seat*/
		    System.out.println("Update Seat: ");
		    int newRoomSeatId = 4;
		   
		    int seatId = 4;
		    SeatModel updateSeat = new SeatModel();
		    updateSeat.setRoomSeatId(newRoomSeatId);
		    updateSeat.setSeatId(seatId);
		    seatDao.update(updateSeat);
		    System.out.println("Seat dengan ID = "+ seatId +" telah behasil diperbaharui");
		    
		    System.out.println();
		    
		    
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
