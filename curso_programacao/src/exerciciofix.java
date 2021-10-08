import java.util.Locale;

public class exerciciofix {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa de escritorio";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos: ");
		System.out.printf("%s que o preço é R$ %.2f reais%n", produto1, preco1);
		System.out.printf("%s que o preço é R$ %.2f reais%n", produto2, preco2);
		
		System.out.println();
		System.out.printf("Gravação: %d anos de idade, código: %d e gênero: " + genero, idade, codigo);
		System.out.println();
		System.out.println();
		System.out.printf("Medir com oito casas decimais: %.8f%n", medida);
		System.out.printf("Arredondando com três casas decimais: %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos EUA: %.3f%n", medida);
	}

}
