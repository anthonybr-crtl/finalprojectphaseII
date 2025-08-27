import java.util.ArrayList;

public class GPACalculator {

	// Calculates a student's GPA by dividing the total quality points 
	public static double calculateGPA(Student student) {
		double totalQualityPoints = calculateTQP(student.getNumberGrades(), student.getCourseCredits());
		double totalCreditHours = calculateTCH(student.getNumberGrades());
		return totalQualityPoints / totalCreditHours;
	}
	
	// Calculates total quality points (the sum of GPA points for a course weighted by credit hours for each course).
	public static double calculateTQP(ArrayList<Double> numberGrades, ArrayList<Double> courseCredits) {
		double TQP = 0;
		for (int i = 0; i < numberGrades.size(); i++) {
			double GPAP = 0;
			if (numberGrades.get(i) >= 95) {
				GPAP = 4.0;
			} else if (numberGrades.get(i) >= 92) {
				GPAP = 3.7;
			} else if (numberGrades.get(i) >= 87) {
				GPAP = 3.3;
			} else if (numberGrades.get(i) >= 85) {
				GPAP = 3.0;
			} else if (numberGrades.get(i) >= 82) {
				GPAP = 2.7;
			} else if (numberGrades.get(i) >= 77) {
				GPAP = 2.3;
			} else if (numberGrades.get(i) >= 75) {
				GPAP = 2.0;
			} else if (numberGrades.get(i) >= 72) {
				GPAP = 1.7;
			} else if (numberGrades.get(i) >= 67) {
				GPAP = 1.3;
			} else if (numberGrades.get(i) >= 65) {
				GPAP = 1.0;
			} else if (numberGrades.get(i) >= 62) {
				GPAP = 0.7;
			} else {
				GPAP = 0.0;
			}
			TQP = TQP + (GPAP * courseCredits.get(i));
		}
		return TQP;
	}
	
	// Calculates total credit hours (the sum from all courses). 
	public static double calculateTCH(ArrayList<Double> courseCredits) {
		double TCH = 0;
		for (double courseCredit : courseCredits) {
			TCH += courseCredit;
		}
		return TCH;
	}
}
