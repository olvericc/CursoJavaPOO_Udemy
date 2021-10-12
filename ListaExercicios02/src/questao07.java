import java.util.Locale;
import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0 && y ==0) {
			System.out.println("Origem");
		}
		else if(x == 0) {
			System.out.println("Eixo x");
		}
		else if(y == 0) {
			System.out.println("Eixo y");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Quadrante 01");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Quadrante 02");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Quadrante 03");
		}
		else {
			System.out.println("Quadrante 04");
		}
		
		sc.close();
	}

}
