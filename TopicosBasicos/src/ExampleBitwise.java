import java.util.Scanner;

public class ExampleBitwise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int mask = 32; // numero que tem o 6th bit com digito 1
		// ou int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true");
		}else {
			System.out.println("6th bit is false");
		}
		
		sc.close();
	}

}
