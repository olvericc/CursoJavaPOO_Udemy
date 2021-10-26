package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Rent #"+ i + ":");
			// name
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			// email
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			// room
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < 10; i++) {
			
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
		
		sc.close();
	}

}
