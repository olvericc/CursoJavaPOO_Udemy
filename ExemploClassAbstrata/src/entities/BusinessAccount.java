package entities;

public class BusinessAccount extends Account {
	
	// class attributes
	private Double loanLimit;
	
	// pattern builder
	public BusinessAccount() {
		super();
	}

	// constructor
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		// super
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	// getters and setters
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// loan
	public void loan (double amount) {
		
		if (amount <= loanLimit) {
			balance += amount - 10.00;
		}
	}
	
	// overlap 
	// withdraw
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
