package entities;

public class SavingsAccount extends Account {

	// class attributes
	private Double interestRate;

	// pattern builder
	public SavingsAccount() {
		super();
	}
	
	// constructor
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	// getters and setters
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	// updateBalance
	public void updateBalance() {
		balance += (balance * interestRate);
	}
	
	// overlap 
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
