
public class Escopo {

	public static void main(String[] args) {
		
		// para se usar uma variavel, devemos atribuir um valor
		
		double price = 400.0;
		double discount;
		
		if (price < 200.0) {
			discount = price * 0.1;
		}
		else {
			discount = 0;	//garantia que a variavel vai ser inicializada.
		}
		
		System.out.println(discount);	//fora do escopo
	}

}
