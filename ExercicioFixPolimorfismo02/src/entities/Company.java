package entities;

public class Company extends TaxPayer{

	// class attributes
	private Integer numberOfEmployees;
	
	// pattern builder
	public Company() {
	}
	
	// constructor with arguments
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	// getters and setters
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	// abstract method tax
	@Override
	public double tax() {
		// 14% of tax
		if (numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		}
		// 16% of tax
		else {
			return getAnualIncome() * 0.16;
		}	
	}	
}
