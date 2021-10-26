package application;

import java.util.Locale;
import java.util.Scanner;

public class example01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// creating vector
		double[] vect = new double[n];
		
		// for
		for (int i = 0; i < n; i++){
			vect[i] = sc.nextDouble();
		}
		
		// average height
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		System.out.printf("Average height: %.2f%n", avg);
		
		sc.close();
	}

}
