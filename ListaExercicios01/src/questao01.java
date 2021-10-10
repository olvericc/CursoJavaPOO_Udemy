import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2, soma;

		valor1 = sc.nextInt();
		valor2 = sc.nextInt();

		soma = valor1 + valor2;

		System.out.println("Soma: " + soma);

		sc.close();

	}

}
