package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		
		// leitura de dados do produto
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		//product.toString(); // converte objeto para string
		
		// impressao para conferir
		/*
		System.out.println(product.name + ", " + 
						   product.price + ", " +
						   product.quantity);
		*/
		System.out.println();
		System.out.println("Product data: " + product);
		
		// adicionando quantidade no estoque
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity); // atualiza a quantidade de produtos
		
		// imprimindo a quantidade depois de ser adicionada
		System.out.println();
		System.out.println("Updated data: " + product);
		
		// removendo quantidade no estoque
		System.out.println();
		System.out.print("Enter the number of product to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		//imprimindo a quantidade depois de ser removida
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
