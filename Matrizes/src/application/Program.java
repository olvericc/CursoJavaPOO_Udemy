package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		// creating matrix
		int[][] mat = new int[n][n];
		
		// for lines
		for (int i = 0; i < mat.length; i++) {
			// for column
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// main diagonal 
		
		System.out.println("Main diagonal: ");
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		// negative numbers
		
		int count = 0;
		for (int i = 0; i < mat.length; i ++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}
		System.out.print("Negative numbers = " + count);
		
		sc.close();
	}

}
