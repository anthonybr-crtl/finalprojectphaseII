public class GPACalculator {

	/*
	 * this method calculates a student's GPA by dividing the total quality points 
	 * (the sum of GPA points for a course * credit hours for every course) 
	 * with the total amount of credit hours (the sum of credit hours earned from every course).   
	 * 
	 * */
	
	public double calculateGPA(double totalQualityPoints, double totalCreditHours) {
		return totalQualityPoints / totalCreditHours;
	}
}
