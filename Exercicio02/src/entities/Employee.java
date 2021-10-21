package entities;

public class Employee {
	
	// class attributies
	public String name;
	public double grossSalary;
	public double tax;
	
	// netSalary
	public double netSalary() {
		return grossSalary - tax;
	}
	
	// increaseSalary
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	
}
