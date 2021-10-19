import java.util.Scanner;

public class testeExemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0; i < n; i = i + 1) { 	//ou i++
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println("Soma: " +  soma);
		
		sc.close();
	}

}
