package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder name: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)?");
		char resp = sc.next().charAt(0);
		
		// if-else
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(number, name, initialDeposit); // constructor with three arguments
		}
		else {
			acc = new Account(number, name);	// constructor with two arguments
		}
		
		// account toString
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(acc); 
		
		// deposit balance
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		// withdraw balance
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		sc.close();
	}

}
