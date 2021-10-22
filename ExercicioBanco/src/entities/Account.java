package entities;

public class Account {

	private int number;
	private String name;
	private double balance;

	// two arguments
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	// three arguments
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);	// encap
	}

	// getters and setters
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	// methods
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.00; // tax $5.00
	}
	
	public String toString() {
		return "Account " 
				+ number
				+ " , Holder name: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
				
	}
}
