
public class Main {

	public static void main(String[] args) {		//declaração de função//
		
		//para exibir determinada frase ou texto
		
		//println - com quebra de linha ao final
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		
		//print - sem quebra de linha ao final
		System.out.print("Olá mundo!");
		System.out.print("Boa tarde!");
		
		//para exibir determinada variavel tipo inteira
		
		int y = 5;
		System.out.println(y);
		
		//para exibir determinada variavel tipo flutuante
		
		double x = 10.35784;
		System.out.println(x);
		
		//para controlar as casas decimais em variaveis do tipo flutuante
		
		System.out.printf("%.2f%n", x);	//apenas duas casas decimais
		System.out.printf("%.4f%n", x);	//apenas quatro casas decimais
		
		//para concatenar varios elementos em apenas um comando
		
		System.out.println("Resultado: " + x + " metros");

		//para exbir concatenacao + formatacao das casas decimais (usando o printf)
		
		System.out.printf("Resultado: %.2f metros %n", x );	
		
		//para exibir varias variaveis em apenas uma frase que sera exibida
		
		String nome = "Eric";
		int idade = 19;
		double renda = 5800.0;
		
		System.out.printf("%s tem %d anos de idade e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}
