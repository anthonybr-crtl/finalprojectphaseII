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
	public double getMinCreditHours() {
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
	
	// Convert a letter grade into a number grade.
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
		} else if (letterGrade.equals("F")) {
			return 50;
		} else {
			System.out.println("Letter grade was not recognized! Returning -1 as number grade.");
			return -1;
		}
	}
	
	public String convertNumericGradeToLetter(double numericGrade) {
		if (numericGrade > 100) {
			System.out.println("Numeric grade must be no more than 100! Returning null as letter grade.");
			return null;
		} else if (numericGrade >= 97) {
			return "A+";
		} else if (numericGrade >= 93) {
			return "A";
		} else if (numericGrade >= 90) {
			return "A-";
		} else if (numericGrade >= 87) {
			return "B+";
		} else if (numericGrade >= 83) {
			return "B";
		} else if (numericGrade >= 80) {
			return "B-";
		} else if (numericGrade >= 77) {
			return "C+";
		} else if (numericGrade >= 73) { 
			return "C";
		} else if (numericGrade >= 70) {
			return "C-";
		} else if (numericGrade >= 67) {
			return "D+";
		} else if (numericGrade >= 63) {
			return "D";
		} else if (numericGrade >= 60) {
			return "D-";
		} else if (numericGrade >= 0) {
			return "F";
		} else if (numericGrade < 0) {
			System.out.println("Numeric grade must be no less than 0! Returning null as letter grade.");
			return null;
		} else {
			System.out.println("Numeric grade was not recognized! Returning null as letter grade.");
			return null;
		}
	}
}
