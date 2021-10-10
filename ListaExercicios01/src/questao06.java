import java.util.Locale;
import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double A, B, C;
		double pi = 3.14159;
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		// Area do triangulo retangulo
		areaTriangulo = (A * C) / 2.0;

		// Area do circulo
		areaCirculo = pi * (C * C);
		
		// Area do trapezio
		areaTrapezio = (A + B) * C / 2.0;
		
		// Area do quadrado
		areaQuadrado = B * B;
		
		// Area do retangulo
		areaRetangulo = A * B;
		
		System.out.printf("Triangulo: %.3f%n", areaTriangulo);
		System.out.printf("Circulo: %.3f%n", areaCirculo);
		System.out.printf("Trapezio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retangulo: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
