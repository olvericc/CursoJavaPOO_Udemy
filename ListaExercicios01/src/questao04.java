import java.util.Locale;
import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numeroFuncionario, horasTrabalhadas;
		double valorPorHora, salario;

		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();

		salario = horasTrabalhadas * valorPorHora;

		System.out.println("Numero do Funcionario: " + numeroFuncionario);
		System.out.printf("Salario do Funcionario:  U$ %.2f%n", salario);

		sc.close();

	}

}
