package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// creating the matrix line and column
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		// creating matrix
		int[][] mat = new int[m][n];
		
		// for lines
		for (int i = 0; i < mat.length; i++ ) {
			// for columns
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		// number 'x' to find the position on matrix
		int x = sc.nextInt();
		
		// finding the position
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				// position of 'x'
				if (mat[i][j] == x) {
					
					System.out.println("Position: " + i + ", " + j);
					// left
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					// right
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					// up
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					// down
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					
				}
			}
		}
		
		
		
		sc.close();
	}

}
