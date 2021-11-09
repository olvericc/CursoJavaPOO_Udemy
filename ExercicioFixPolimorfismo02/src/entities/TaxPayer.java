package entities;

public abstract class TaxPayer {

	// class attributes
	private String name;
	private Double anualIncome; 
	
	// pattern builder
	public TaxPayer() {}

	// constructor with arguments
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	// abstract method
	public abstract double tax();
	// tax
}
