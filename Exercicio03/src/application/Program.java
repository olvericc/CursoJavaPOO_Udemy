package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		
		s1.name = sc.nextLine();
		s1.grade1 = sc.nextDouble();
		s1.grade2 = sc.nextDouble();
		s1.grade3 = sc.nextDouble();
		
		System.out.printf("Final grade: %.2f%n", s1.finalGrade());
		
		if (s1.finalGrade() < 60.0) {
			System.out.println("Failed");
			System.out.printf("Miss %.2f points %n", s1.missingPoints());
		}
		else {
			System.out.println("Passed");
		}
		sc.close();
	}

}
