import java.util.ArrayList;
import java.util.Arrays;

public class UnitTester {
	public static void main(String[] args) {
		// Create three objects to test. 
		Student student = new Student("Fred");
		Course course = new Course();
		GPACalculator gpacalc = new GPACalculator(); 
		
		try {
			// Run all unit test methods. 
			testCreditHours(course);
			testNumberGrade(course);
			testMinCreditHours(course);
			testMaxCreditHours(course);
			testGradeConversion();
			System.out.println();
			runScenario();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// Simulates a bunch of specific user interactions to see if the results make sense. 
	public static void runScenario() {
		Student student = new Student("Bob");
		student.addCourse("Math", 2.0, true, 97, "A");
		student.addCourse("Science", 2.0, false, 0, "A");
		student.addCourse("Social Studies", 2.0, true, 50, "F");
		student.removeCourse("Social Studies");
		System.out.println("Course names: " + student.getCourseNames());
		System.out.println("Number grades: " + student.getNumberGrades());
		System.out.println("Course Credits: " + student.getCourseCredits());
		System.out.println("Your GPA is: " + student.getGPA());
	}

	// Test set/get credit hours methods.
	public static void testCreditHours(Course course) {
		// Test that we can set any value.
		course.setCreditHours(5.0);
		boolean pass = 5.0 == course.getCreditHours();
		System.out.println("Can set/get credit hours: " + pass);
		// Test if we can set a value that's too low. 
		course.setCreditHours(-1.0);
		pass = !(-1.0 == course.getCreditHours());
		System.out.println("Can't set/get credit hours: " + pass);
		// Test if we can set a value that's too high. 
		course.setCreditHours(6.0);
		pass = !(6.0 == course.getCreditHours());
		System.out.println("Can't set/get credit hours: " + pass);
	}

	// Test set/get number grade methods.
	public static void testNumberGrade(Course course) {
		course.setNumberGrade(83);
		boolean pass = 83 == course.getNumberGrade();
		System.out.println("Can set/get number grade: " + pass);
	}
	
	// Test set/get minimum credit hour methods. 
	public static void testMinCreditHours(Course course) {
		course.setMinCreditHours(21);
		boolean pass = 21 == course.getMinCreditHours();
		System.out.println("Can set/get minimum credit hours: " + pass);
	}
	
	// Test set/get maximum credit hour methods. 
	public static void testMaxCreditHours(Course course) {
		course.setMaxCreditHours(52);
		boolean pass = 52 == course.getMaxCreditHours();
		System.out.println("Can set/get maximum credit hours: " + pass);
	}
	
	// Test converting between letter and numeric grades.
	public static void testGradeConversion() {
		// Initialize two letter grade arrays to compare. 
		ArrayList<String> letterGrades = new ArrayList<String>();
		letterGrades.addAll(Arrays.asList("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"));
		ArrayList<String> convertedLetterGrades = new ArrayList<String>();
		for (String letterGrade : letterGrades) {
			// Convert letter --> numeric --> letter to see if it stays the same.
			double numericGrade = Course.convertLetterGradeToNumeric(letterGrade);
			String convertedLetterGrade = Course.convertNumericGradeToLetter(numericGrade);
			convertedLetterGrades.add(convertedLetterGrade); 
		}
		// Compare arrays to see if they match. 
		boolean pass = letterGrades.equals(convertedLetterGrades);
		System.out.println("Grade conversions are internally consistent: " + pass);
		
		// Pass an invalid letter grade to see if it returns -1.
		double numericGrade = Course.convertLetterGradeToNumeric("cat");
		pass = numericGrade == -1;
		System.out.println("Invalid letter grades convert to -1: " + pass);
		
		// Pass a numeric grade over 100 to see if it returns null. 
		String letterGrade = Course.convertNumericGradeToLetter(101);
		pass = letterGrade == null;
		System.out.println("Numeric grades over 100 return null: " + pass);
		
		// Pass a numeric grade below 0 to see if it returns null. 
		letterGrade = Course.convertNumericGradeToLetter(-1);
		pass = letterGrade == null;
		System.out.println("Numeric grades over 100 return null: " + pass);
	}
}
