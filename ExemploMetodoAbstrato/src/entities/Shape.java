package entities;

import entities.enums.Color;

public abstract class Shape {

	// class attributes
	private Color color;
	
	// pattern builder
	public Shape() {}

	// constructor 
	public Shape(Color color) {
		this.color = color;
	}
	
	// getters and setters
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// abstract method
	public abstract double area();
	
	
}
