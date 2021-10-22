package entities;

import java.util.Date;

public class Order {
	
	private Date date;
	private Products product;
	
	public Order(Date date, Products product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV"; // name nao tem modificador de acesso
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}
}
