package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// verificar os valores dos atributos do tipo product

		/*
		 * 	System.out.println(product.name);       null
		 *  System.out.println(product.price);	    0.0
		 * 	System.out.println(product.quantity);	0
		 */
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		

		Products product = new Products(name, price); // obrigando informar os dados, evitando inconsistencia
		
		// alterando nome do produto com metodo get e set
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		// alterando preco do produto com metodo get e set
		product.setPrice(1000.00);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of product to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();

	}

}
