import java.util.Locale;
import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double raio, area;

		raio = sc.nextDouble();

		area = pi * (raio * raio);

		System.out.printf("Area do circulo: %.4f%n", area);

		sc.close();
	}

}
