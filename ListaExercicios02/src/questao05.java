import java.util.Locale;
import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double valor;
		
		System.out.println("codigo              especificacao              preco");
		System.out.println("1                  cachorro-quente            R$ 4,00");
		System.out.println("2                     x-salada                R$ 4,50");
		System.out.println("3                     x-bacon                 R$ 5,00");
		System.out.println("4                  torrada simples            R$ 2,00");
		System.out.println("5                   refrigerante              R$ 1,50");
		
		System.out.println("Digite o código do item e a quantidade desejada: ");
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			valor = (4.0 * quantidade);
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if (codigo == 2) {
			valor = (4.50 * quantidade);
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if (codigo == 3) {
			valor = (5.00 * quantidade);
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if (codigo == 4) {
			valor = (2.00 * quantidade);
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else {
			valor = (1.50 * quantidade);
			System.out.printf("Total: R$ %.2f%n", valor);
		}
	
		sc.close();
	}

}
