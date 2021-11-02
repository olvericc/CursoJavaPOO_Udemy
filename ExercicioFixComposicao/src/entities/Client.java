package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	// simpleDateFormat
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// class attributes
	private String name;
	private String email;
	private Date birthDate;
	
	// pattern builder
	public Client() {}

	// constructor
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date bithDate) {
		this.birthDate = bithDate;
	}
	
	// toString
	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - "  + email;  
	}
	
}
