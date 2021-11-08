package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

	// class attributes
	private Double width;
	private Double height;
	
	// pattern builder
	public Rectangle() {
		super();
	}
		
	// constructor
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	// getters and setters
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	// abstract area
	@Override
	public double area() {
		return width * height;
	}

}
