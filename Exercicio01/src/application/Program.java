package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// creating object of type Rectangle
		Rectangle rec = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();

		System.out.printf("Area: %.2f%n", rec.area());
		System.out.printf("Perimeter: %.2f%n", rec.perimeter());
		System.out.printf("Diagonal: %.2f%n", rec.diagonal());

		sc.close();
	}

}
