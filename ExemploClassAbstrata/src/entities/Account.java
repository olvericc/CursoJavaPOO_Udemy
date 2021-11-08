package entities;

public abstract class Account {

	// class attributes
	private Integer number;
	private String holder;
	protected Double balance;
	
	// pattern builder
	public Account() {}

	// constructor
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	// getters and setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	// withdraw
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	// deposit
	public void deposit (double amount) {
		balance += amount;
	}
		
}	
