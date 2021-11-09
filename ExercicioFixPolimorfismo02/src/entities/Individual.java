package entities;

public class Individual extends TaxPayer{

	// class attributes (additional attribute)
	private Double healthExpenditures;
	
	// pattern builder
	public Individual() {
	}
	
	// constructor with arguments
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		//reuse of attributes
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	// getters and setters
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	// abstract method tax()
	@Override
	public double tax() {
		double basicTax;
		// under 20.000 pay 15% tax
		if (getAnualIncome() < 20000.0) {
			basicTax = getAnualIncome() * 0.15;
		}
		// above or equal to 20.000 pay 25% tax
		else {
			basicTax = getAnualIncome() * 0.25;
		}
		// rule to calculate healthExpenditures
		basicTax -= (getHealthExpenditures() * 0.5);
		// to negative tax
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
		
		// alternative form to calculate tax()
		
		/*
		*  double basicTax = (getAnualIncome( < 20000.0) ? 
		* 					  getAnualIncome() * 0.15 : 
		* 					  getAnualIncome() * 0.25; 
		* 
		* 		? -> then
		* 		: -> else
		*/
	}
}
