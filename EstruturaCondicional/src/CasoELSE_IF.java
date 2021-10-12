import java.util.Scanner;

public class CasoELSE_IF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int hora;
		
		System.out.println("Quantas horas são?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else if (hora < 18) {	// encadeamento de estruturas condicionais
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
			 
		sc.close();
	}

}
