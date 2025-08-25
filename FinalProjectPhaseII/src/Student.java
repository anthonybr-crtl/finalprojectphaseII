import java.util.ArrayList;
public class Student {
	//ArrayLists to store a course along with it's credit hours and number grade.
	private static ArrayList<String> courseNames= new ArrayList<>();
	private static ArrayList<Double> numberGrades = new ArrayList<>();
	private static ArrayList<Double> courseCredits = new ArrayList<>();
	
	//Used to test all of the methods until a GUI is added.
	public static void main (String args[]) {
    addCourse("math",2.0,true,97,"A");
    addCourse("Science",2.0,false,0,"A");
    addCourse("Social Studies",2.0,true,50,"F");
    removeCourse("Social Studies");
	System.out.println(courseNames);
	System.out.println(numberGrades);
	System.out.println(courseCredits);
	
	System.out.println("Your GPA is: "+GPA());
	}
	
	
	// Method used to add a course. Parameters include a Course Name, credit hours, a number grade, and a letter grade. 
	// The boolean is used to determine whether someone is submitting a number or letter grade. 
	// If the boolean is set to true, the method will disregard the letter grade.
	// If the boolean is set to false, the method will disregard the number grade and convert the letter grade. Hopefully this can be polished when creating the GUI.
	// When creating the GUI, please be sure to implement a way to prevent someone from submitting more than one course of the same name.
   public static void addCourse (String courseName, double creditHours, boolean hasNumberGrade, double numberGrade, String letterGrade) {
		 Course course = new Course();
		 course.setCreditHours(creditHours);
		 if (hasNumberGrade==true) {
			 course.setNumberGrade(numberGrade);
		 }else {
			 course.setNumberGrade(course.convertLetterGradeToNumeric(letterGrade));
		 }
		 courseNames.add(courseName);
		 numberGrades.add(course.getNumberGrade());
		 courseCredits.add(course.getCreditHours());
	}
	
   //This method is used to remove a course by providing it with the course name.
	public static void removeCourse(String courseName) {
		 int index = courseNames.indexOf(courseName);
		 courseNames.remove(index);
		 numberGrades.remove(index);
		 courseCredits.remove(index);
		
	}
	//calculates total quality points. see GPACalulator class for more details.
	public static double calculateTQP() {
		double TQP=0;
		for (int i = 0; i<numberGrades.size(); i++) {
			double GPAP=0;
			if (numberGrades.get(i)>=95) {
				GPAP=4.0;
			}else if (numberGrades.get(i)>=92) {
				GPAP=3.7;
			}else if (numberGrades.get(i)>=87) {
				GPAP=3.3;
			}else if (numberGrades.get(i)>=85) {
				GPAP=3.0;
			}else if (numberGrades.get(i)>=82) {
				GPAP=2.7;
			}else if (numberGrades.get(i)>=77) {
				GPAP=2.3;
			}else if (numberGrades.get(i)>=75) {
				GPAP=2.0;
			}else if (numberGrades.get(i)>=72) {
				GPAP=1.7;
			}else if (numberGrades.get(i)>=67) {
				GPAP=1.3;
			}else if (numberGrades.get(i)>=65) {
				GPAP=1.0;
			}else if (numberGrades.get(i)>=62) {
				GPAP=0.7;
			}else{
				GPAP=0.0;
			}
			TQP = TQP+(GPAP * courseCredits.get(i));
		}
		return TQP;
	}
	
	//calculates total quality points. see GPACalulator class for more details.
	public static double calculateTCH() {
		double TCH=0;
		for (int i=0; i<courseCredits.size(); i++) {
			TCH=TCH+courseCredits.get(i);
		}
		return TCH;
	}
	//Uses GPACalulator class to calculate GPA.
	public static double GPA() {
		GPACalculator calc= new GPACalculator();
		double GPA = calc.calculateGPA(calculateTQP(),calculateTCH());
		return GPA;
	}
	
	
	
	
	
	
	
	
	
}
