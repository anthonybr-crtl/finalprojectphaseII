public class UnitTester {
	public static void main(String[] args) {
		// Create three objects to test. 
		Student student = new Student();
		Course course = new Course();
		GPACalculator gpacalc = new GPACalculator(); 
		
		try {
			boolean pass;
			course.setCreditHours(5.0);
			pass = 5.0 == course.getCreditHours();
			System.out.println("Set/Get credit hours works: " + pass);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
