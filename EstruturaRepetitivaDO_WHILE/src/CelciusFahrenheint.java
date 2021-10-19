import java.util.Locale;
import java.util.Scanner;

public class CelciusFahrenheint {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resposta;
		
		do {
			System.out.print("Digite a temperatura em celcius: ");
			double celcius = sc.nextDouble();
			double fahrenheint = 9.0 * celcius / 5.0 + 32.0;
			System.out.printf("Equivalente em fahrenheint: %.1f%n", fahrenheint);
			System.out.print("Deseja repetir (s/n)? ");
			resposta = sc.next().charAt(0);
		} while (resposta != 'n');
		
		sc.close();
	}

}
