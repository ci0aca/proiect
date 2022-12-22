package ro.digitalnation.mircea.clase;

import java.util.Date;

public class rezervare {
	Long idRezervare;
	Date checkIn;
	Date checkOut;
	
	
	public rezervare(Long idRezervare, Date checkIn, Date checkOut) {
		super();
		this.idRezervare = idRezervare;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Long getIdRezervare() {
		return idRezervare;
	}


	public void setIdRezervare(Long idRezervare) {
		this.idRezervare = idRezervare;
	}


	public Date getCheckIn() {
		return checkIn;
	}


	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}


	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	
}
