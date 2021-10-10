import java.util.Locale;
import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo1, numero1, codigo2, numero2;
		double valor1, calculo1, valor2, calculo2, total;
		
		codigo1 = sc.nextInt();
		numero1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		calculo1 = valor1 * numero1;
		calculo2 = valor2 * numero2;
		
		total = calculo1 + calculo2; 
		
		System.out.printf("Total a pagar: R$ %.2f%n", total);
		System.out.println("Codigo 1: " + codigo1 + "Código 2:" + codigo2);
		sc.close();
	}

}
