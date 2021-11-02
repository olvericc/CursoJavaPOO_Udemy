package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// reading client data
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		// creating object of type client
		Client client = new Client(name, email, birthDate);

		// reading order data
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		// creating object of type order
		Order order = new Order(new Date(), status, client);
		
		// reading 'n' items to this order
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine(); // consume the line break
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			// creating object of type product
			Product product = new Product(productName, productPrice);
			
			// creating object of type orderItem
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			// adding to the order one item
			order.addItem(it);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		
		sc.close();
	}

}
