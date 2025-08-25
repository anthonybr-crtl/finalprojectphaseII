
public class Course {

	private double creditHours = 0;
	private double numberGrade = 0;
	
	public void setCreditHours(double creditHours) {
		this.creditHours = creditHours;
	}
	
	public void setNumberGrade(double numberGrade) {
		this.numberGrade = numberGrade;
	}
	public void convertLetterGradeToNumeric(String letterGrade) {
		if (letterGrade.equals("A+")) {
			numberGrade= 97;
		}else if (letterGrade.equals("A")) {
			numberGrade= 95;
		}else if (letterGrade.equals("A-")) {
			numberGrade= 92;
		}else if (letterGrade.equals("B+")) {
			numberGrade= 87;
		}else if (letterGrade.equals("B")) {
			numberGrade= 85;
		}else if (letterGrade.equals("B-")) {
			numberGrade= 82;
		}else if (letterGrade.equals("C+")) {
			numberGrade= 77;
		}else if (letterGrade.equals("C")) {
			numberGrade= 75;
		}else if (letterGrade.equals("C-")) {
			numberGrade= 72;
		}else if (letterGrade.equals("D+")) {
			numberGrade= 67;
		}else if (letterGrade.equals("D")) {
			numberGrade= 65;
		}else if (letterGrade.equals("D-")) {
			numberGrade= 62;
		}else {
			numberGrade = 50;
		}
	}
	public double getNumberGrade() {
		return numberGrade;
	}
	public double getCreditHours() {
		return creditHours;
	}
	
}
