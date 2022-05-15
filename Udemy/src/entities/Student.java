package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	double missing;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String result() {
		if (finalGrade() >= 60) {
			return "Pass";
		} else {
			missing = 60 - finalGrade();
			return "FAILED," + " MISSING " 
			+ missing + " POINTS.";
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " 
		+ String.format("%.2f", finalGrade()) ;
	}
}
