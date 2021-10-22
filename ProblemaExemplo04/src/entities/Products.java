package entities;

public class Products {

	// atributos encapsulados
	String name;
	private double price;
	private int quantity;

	// construtor padrao
	public Products() {
	}

	// construtor personalizado
	public Products(String name, double price, int quantity) {
		//super();	// super -> heranca
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// construtor (sobrecarga) iniciar quantidade com valor 0
	public Products(String name, double price) {
		this.name = name;
		this.price = price;
		// this.quantity = 0; ou quantity = 0;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	/*
	 * // metodos get e set public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public double getPrice() { return price; }
	 * 
	 * public void setPrice(double price) { this.price = price; }
	 * 
	 * public int getQuantity() { // sem setQuantity, para proteger com
	 * inconsistencia return quantity; }
	 */

	// metodos
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // aumentando
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity; // diminuindo
	}

	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
