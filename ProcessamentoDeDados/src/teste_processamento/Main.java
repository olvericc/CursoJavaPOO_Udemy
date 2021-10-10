package teste_processamento;

public class Main {

	public static void main(String[] args) {

		// primeiro exemplo
		int x, y;

		x = 5;
		y = 2 * x;

		System.out.println(x);
		System.out.println(y);

		// segundo exemplo
		int a;
		double b;

		a = 5;
		b = 2 * a;

		System.out.println(a);
		System.out.println(b);

		// nesse caso o resultado de 2*a foi convertido para double, por conta da
		// variavel ser do tipo flutuante

		// terceiro exemplo
		double baseMenor, baseMaior, altura, area;

		baseMenor = 6.0;
		baseMaior = 8.0;
		altura = 5.0;

		area = (baseMenor + baseMaior) / 2.0 * altura;
		System.out.println(area);

		// caso o tipo das variaveis fosse float --> colocar a letra "f" depois do
		// numero
		/*
		 * float baseMenor, baseMaior, altura, area;
		 * 
		 * baseMenor = 6f; baseMaior = 8f; altura = 5f;
		 * 
		 * area = (baseMenor + baseMaior) / 2f * altura; System.out.println(area);
		 */

		// quarto exemplo
		int var1, var2;
		double resultado;

		var1 = 5;
		var2 = 2;

		resultado = (double) var1 / var2; // usando o casting -> conversão explicita dos valores
		System.out.println(resultado);
		
		// quinto exemplo
		double valor1;
		int valor2;
		
		valor1 = 5.0;
		valor2 = (int) valor1;
		
		System.out.println(valor2);
	}

}
