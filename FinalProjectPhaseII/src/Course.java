
public class Course {

	private double creditHours = 0;
	private double numberGrade = 0;
	
	//method used to set a Course's credit hours.
	public void setCreditHours(double creditHours) {
		this.creditHours = creditHours;
	}
	
	//method used to set the number grade earned for a course.
	public void setNumberGrade(double numberGrade) {
		this.numberGrade = numberGrade;
	}
	
	//method used to convert a letter grade someone submits into a number grade.
	public double convertLetterGradeToNumeric(String letterGrade) {
		if (letterGrade.equals("A+")) {
			return 97;
		}else if (letterGrade.equals("A")) {
			return 95;
		}else if (letterGrade.equals("A-")) {
			return 92;
		}else if (letterGrade.equals("B+")) {
			return 87;
		}else if (letterGrade.equals("B")) {
			return 85;
		}else if (letterGrade.equals("B-")) {
			return 82;
		}else if (letterGrade.equals("C+")) {
			return 77;
		}else if (letterGrade.equals("C")) {
			return 75;
		}else if (letterGrade.equals("C-")) {
			return 72;
		}else if (letterGrade.equals("D+")) {
			return 67;
		}else if (letterGrade.equals("D")) {
			return 65;
		}else if (letterGrade.equals("D-")) {
			return 62;
		}else {
			return 50;
		}
	}
	
	//method used to obtain the grade earned in a Course.
	public double getNumberGrade() {
		return numberGrade;
	}
	//method used to obtain a Course's credit hours.
	public double getCreditHours() {
		return creditHours;
	}
	
}
