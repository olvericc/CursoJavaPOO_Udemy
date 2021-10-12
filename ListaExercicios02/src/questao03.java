import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0) {
			System.out.println("Sao multiplos");
		}
		else if (B % A == 0 ){
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
	}

}
