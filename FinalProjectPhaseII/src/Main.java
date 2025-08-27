
public class Main {
	public static void main (String args[]) {
		Student student = new Student();
		// Used to test all of the methods until a GUI is added.
		student.addCourse("Math", 2.0, true, 97, "A");
		student.addCourse("Science", 2.0, false, 0, "A");
		student.addCourse("Social Studies", 2.0, true, 50, "F");
		student.removeCourse("Social Studies");
		System.out.println("Course names: " + student.getCourseNames());
		System.out.println("Number grades: " + student.getNumberGrades());
		System.out.println("Course Credits: " + student.getCourseCredits());
	
		System.out.println("Your GPA is: " + student.getGPA());
	}
}
