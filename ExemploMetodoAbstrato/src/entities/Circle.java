package entities;

import entities.enums.Color;

public class Circle extends Shape{

	// class attributes
	private Double radius;
	
	// pattern builder
	public Circle() {
		super();
	}
	
	// constructor with arguments
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	// getters and setters
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	// abstract area
	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}

}
