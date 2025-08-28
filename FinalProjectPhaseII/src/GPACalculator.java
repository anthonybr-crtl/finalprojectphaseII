import java.util.ArrayList;

public class GPACalculator {

	// Calculates a student's GPA by dividing the total quality points 
	public static double calculateGPA(Student student) {
		double totalQualityPoints = calculateTQP(student.getNumberGrades(), student.getCourseCredits());
		double totalCreditHours = calculateTCH(student.getCourseCredits());
		return totalQualityPoints / totalCreditHours;
	}
	
	// Calculates total quality points (the sum of GPA points for a course weighted by credit hours for each course).
	public static double calculateTQP(ArrayList<Double> numberGrades, ArrayList<Double> courseCredits) {
		double TQP = 0;
		for (int i = 0; i < numberGrades.size(); i++) {
			double GPAP = 0;
			double numberGrade = numberGrades.get(i);
			GPAP = scaleToFour(numberGrade); // Scale from 0-100 to 0-4.
			GPAP *= courseCredits.get(i); // Weight grade by credits. 
			TQP += GPAP; // Add GPA points from this class to the total of quality points. 
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
	
	// Squishes a number grade from 0-100 to 0-4. 
	public static double scaleToFour(double numberGrade) {
		if (numberGrade > 100) {
			System.out.println("Number grade must not be more than 100!");
			return -1;
		} else if (numberGrade < 0) {
			System.out.println("Number grade must not be less than 0!");
			return -1;
		} else {
			return numberGrade / 25; // Squish from 0-100 to 0-4.
		}
	}
}
