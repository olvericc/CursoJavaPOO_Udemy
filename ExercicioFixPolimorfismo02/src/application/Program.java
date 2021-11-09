package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.Company;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// list
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or campany (i/c)? ");
			
			sc.nextLine(); // breakline
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			Double anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else if (type == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
			else {
				System.out.println("Error!");
			}
		}
		
		// taxes paid
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer taxpayer : list) {
			System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.tax()));
		}
		
		// total taxes
		System.out.println();
		double sum = 0.0;
		
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
		
		sc.close();
	}
}
