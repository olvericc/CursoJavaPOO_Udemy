import java.util.Scanner;

public class CondicionalComposta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else {
			System.out.println("Boa tarde");
		}
		sc.close();
	}

}
