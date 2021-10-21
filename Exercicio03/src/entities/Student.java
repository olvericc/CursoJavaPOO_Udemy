package entities;

public class Student {
	
	// class attributies
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	// finalGrade
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	// missingPoints
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
	
	
}
