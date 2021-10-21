package entities;

public class Rectangle {

	// class attributes
	public double width;
	public double height;

	// area
	public double area() {
		return width * height;
	}

	// perimeter
	public double perimeter() {
		return 2 * (width + height);
	}

	// diagonal
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
