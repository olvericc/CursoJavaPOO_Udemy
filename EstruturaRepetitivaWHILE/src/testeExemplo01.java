import java.util.Scanner;

public class testeExemplo01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int soma = 0;
		while (x != 0) { // le numeros ate ser diferente de zero
			soma += x; // ou soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println("Soma: " + soma);

		sc.close();
	}

}
