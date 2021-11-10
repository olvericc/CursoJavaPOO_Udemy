package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	// class attributes
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	// simpledateformat
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// pattern builder
	public Reservation() {}
	
	// constructor
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}	
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	// getters and setters
	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	// method duration()
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	// method updateDates()
	public void updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)){
			throw new DomainException("Check-out date must be after check-in date");
		}		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}	
		
	// toString
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
	
}
