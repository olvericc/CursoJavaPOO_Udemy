package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	// class attributes
	private Date manufactureDate;

	// SimpleDateFormat
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// pattern builder
	public UsedProduct() {
		super();
	}

	// constructor
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	// getters and setters
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	// priceTag -> toString
	@Override
	public String priceTag() {
		return getName() + " (used) $ " + String.format("%.2f", getPrice())
			   + "Manufacture date: " + sdf.format(manufactureDate)
			   + ")";
	}
	
}
