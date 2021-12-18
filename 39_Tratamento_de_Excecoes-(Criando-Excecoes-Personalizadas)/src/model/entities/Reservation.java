package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy"); // static - not instantiate a new SimpleDateFormat for each object Reservation 
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}
	
	public long duration() {
		// Subtration between the two dates in milisecond
		long diff = checkOut.getTime() - checkIn.getTime();
		// miliseconds to days
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			return " Reservation dates for update must be future";
		}
		if(!checkOut.after(checkIn)) {
			return " Check-out date must be after check-in date";
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		// if return null its because there is no error
		return null;
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}

}
