package entities;

public class OutsourcedEmployee extends Employee { // inheritance

	// class attributes
	private Double additionalCharge;
	
	// pattern builder
	public OutsourcedEmployee() {
		super();
	}
	
	// constructor
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	// getters and setters
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	// additionalCharge
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
}