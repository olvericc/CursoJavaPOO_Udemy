import java.util.Scanner;

public class ProblemaExemplo {

	public static void main(String[] args) { // padrao enterpoint

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int higher = max(n1, n2, n3);

		showResult(higher);

		sc.close();
	}
	// declarando uma nova funcao denro da classe
	public static int max (int x, int y, int z) {
		int aux; // so existe neste escopo
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > x && y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return(aux);	//retorna esse valor	
	}

	public static void showResult(int value) {
		System.out.println("Higher: " + value);
	}
}
