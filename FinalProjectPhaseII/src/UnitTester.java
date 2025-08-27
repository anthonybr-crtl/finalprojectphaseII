public class UnitTester {
	public static void main(String[] args) {
		// Create three objects to test. 
		Student student = new Student();
		Course course = new Course();
		GPACalculator gpacalc = new GPACalculator(); 
		
		try {
			// Run all unit test methods. 
			testCreditHours(course);
			testNumberGrade(course);
		} catch (Exception e) {
			System.out.println(e);
		}
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
		System.out.println("Set/Get credit hours works: " + pass);
	}
}
