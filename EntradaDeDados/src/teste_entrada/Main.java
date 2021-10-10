package teste_entrada;

import java.util.Locale; //import do Locale
import java.util.Scanner; //import do Scanner

public class Main {

	public static void main(String[] args) {

		// usando o locale para ler um numero e imprimir com um ponto
		Locale.setDefault(Locale.US);

		// declarando variavel do tipo Scanner
		Scanner sc = new Scanner(System.in); // associando o Scanner sc ao teclado no modo console

		// Para ler uma palavra

		String x;

		x = sc.next();
		System.out.println("Você digitou a palavra: " + x);

		// sc.close(); // para encerrar o recurso Scanner sc

		// Para ler um numero inteiro

		int y;

		y = sc.nextInt();
		System.out.println("Você digitou o numero inteiro: " + y);

		// sc.close();

		// Para ler um numero com ponto flutuante

		double f;

		f = sc.nextDouble();
		System.out.println("Você digitou o numero double: " + f);

		// sc.close();

		// Para ler um numero com ponto flutuante usando printf

		/*
		 * double f;
		 * 
		 * f = sc.nextDouble();
		 * System.out.printf("Você digitou o numero double: %.1f%n", f);
		 * 
		 * sc.close();
		 */

		// Para ler um caractere

		char c;

		c = sc.next().charAt(0);	//.charAt(0) --> função que imprime apenas a primeira letra digitada
		System.out.println("Você digitou o caractere: " + c);

		// sc.close();
		
		// Para ler varios dados de tipos diferentes
		
		String x1;
		int x2;
		double x3;
		
		x1 = sc.next();
		x2 = sc.nextInt();
		x3 = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		sc.close();

	}

}
