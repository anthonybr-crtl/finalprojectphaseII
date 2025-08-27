import java.util.ArrayList;

public class Student {
	// ArrayLists to store a course along with it's credit hours and number grade.
	private static ArrayList<String> courseNames = new ArrayList<>();
	private static ArrayList<Double> numberGrades = new ArrayList<>();
	private static ArrayList<Double> courseCredits = new ArrayList<>();
	
	// Method used to add a course. Parameters include a Course Name, credit hours, a number grade, and a letter grade. 
	// The boolean is used to determine whether someone is submitting a number or letter grade. 
	// If the boolean is set to true, the method will disregard the letter grade.
	// If the boolean is set to false, the method will disregard the number grade and convert the letter grade. Hopefully this can be polished when creating the GUI.
	// When creating the GUI, please be sure to implement a way to prevent someone from submitting more than one course of the same name.
    public void addCourse (String courseName, double creditHours, boolean hasNumberGrade, double numberGrade, String letterGrade) {
		 Course course = new Course();
		 course.setCreditHours(creditHours);
		 if (hasNumberGrade == true) {
			 course.setNumberGrade(numberGrade);
		 } else {
			 course.setNumberGrade(Course.convertLetterGradeToNumeric(letterGrade));
		 }
		 courseNames.add(courseName);
		 numberGrades.add(course.getNumberGrade());
		 courseCredits.add(course.getCreditHours());
	}
	
    // Remove the named course from the student.
	public void removeCourse(String courseName) {
		 int index = courseNames.indexOf(courseName);
		 courseNames.remove(index);
		 numberGrades.remove(index);
		 courseCredits.remove(index);
	} 
	
	// Get course names. 
	public ArrayList<String> getCourseNames() {
		return courseNames;
	}
	
	// Set course names.
	public void setCourseNames(ArrayList<String> newCourseNames) {
		courseNames = newCourseNames;
	}
	
	// Get number grades.
	public ArrayList<Double> getNumberGrades() {
		return numberGrades;
	}
	
	// Set number grades.
	public void setNumberGrades(ArrayList<Double> newNumberGrades) {
		numberGrades = newNumberGrades;
	}
	
	// Get course credits.
	public ArrayList<Double> getCourseCredits() {
		return courseCredits;
	}
	
	// Set course credits. 
	public void setCourseCredits(ArrayList<Double> newCourseCredits) {
		
	}
	
	// Uses GPACalulator class to calculate GPA.
	public double getGPA() {
		return GPACalculator.calculateGPA(this);
	}
	
	
	
	
	
	
	
	
	
}
