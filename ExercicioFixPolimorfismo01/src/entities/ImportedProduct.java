package entities;

public class ImportedProduct extends Product{

	// class attributes
	private Double customsFee;
	
	// pattern builder
	public ImportedProduct() {
		super();
	}

	// constructor
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	// getters and setters
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// totalPrice
	public Double totalPrice() {
		return getPrice()  + customsFee;
	}
	
	// priceTag -> toString
	@Override 
	public String priceTag() {
		return getName() + " $" + String.format("%.2f", totalPrice()) 
		+ " (Customs fee: $ " + String.format("%.2f", customsFee) 
		+ ")"; 
	}
	
}
