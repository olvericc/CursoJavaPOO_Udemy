package entities;

public class Product {

	// class attributes
	private String name;
	private Double price;
	
	// pattern builder
	public Product() {}

	// constructor
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
