public class Course {

	private double creditHours = 0;
	private double numberGrade = 0;
	private double minCreditHours = 1;
	private double maxCreditHours = 5;
	
	// Set a Course's minimum credit hours.
	public void setMinCreditHours(double min) {
		this.minCreditHours = min;
	}
	
	// Get a Course's minimum credit hours.
	public double setMinCreditHours() {
		return this.minCreditHours;
	}
	
	// Set a Course's maximum credit hours.
	public void setMaxCreditHours(double max) {
		this.maxCreditHours = max;
	}
	
	// Get a Course's maximum credit hours.
	public double getMaxCreditHours() {
		return this.maxCreditHours;
	}
	
	// Set a Course's credit hours.
	public void setCreditHours(double creditHours) {
		if (creditHours < minCreditHours) {
			System.out.println("Credit hours must be at least " + minCreditHours + "!");
		} else if (creditHours > maxCreditHours) {
			System.out.println("Credit hours must be less than " + maxCreditHours + "!");
		} else {
			this.creditHours = creditHours;
		}
	}
	
	// Get a Course's credit hours.
	public double getCreditHours() {
		return creditHours;
	}
	
	// Set the number grade earned for a course.
	public void setNumberGrade(double numberGrade) {
		this.numberGrade = numberGrade;
	}
	
	// Get the grade earned in a Course.
	public double getNumberGrade() {
		return numberGrade;
	}
	
	// Convert a letter grade someone submits into a number grade.
	public double convertLetterGradeToNumeric(String letterGrade) {
		if (letterGrade.equals("A+")) {
			return 97;
		} else if (letterGrade.equals("A")) {
			return 95;
		} else if (letterGrade.equals("A-")) {
			return 92;
		} else if (letterGrade.equals("B+")) {
			return 87;
		} else if (letterGrade.equals("B")) {
			return 85;
		} else if (letterGrade.equals("B-")) {
			return 82;
		} else if (letterGrade.equals("C+")) {
			return 77;
		} else if (letterGrade.equals("C")) {
			return 75;
		} else if (letterGrade.equals("C-")) {
			return 72;
		} else if (letterGrade.equals("D+")) {
			return 67;
		} else if (letterGrade.equals("D")) {
			return 65;
		} else if (letterGrade.equals("D-")) {
			return 62;
		} else {
			return 50;
		}
	}
}
