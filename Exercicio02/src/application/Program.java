package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee f1 = new Employee();
		
		System.out.print("Name: ");
		f1.name = sc.nextLine();
		System.out.printf("Gross salary: ");
		f1.grossSalary = sc.nextDouble();
		System.out.printf("Tax: ");
		f1.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employe: " + f1);
		System.out.println();
		
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		f1.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + f1);
		sc.close();
		
		sc.close();
	}

}
