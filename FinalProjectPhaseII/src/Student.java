import java.util.ArrayList;
public class Student {
	private static ArrayList<String> courseNames= new ArrayList<>();
	private static ArrayList<Double> numberGrades = new ArrayList<>();
	private static ArrayList<Double> courseCredits = new ArrayList<>();
	
	
	public static void main (String args[]) {
	
	}
	
	
	
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
	
   
	public static void removeCourse(String courseName) {
		 int index = courseNames.indexOf(courseName);
		 courseNames.remove(index);
		 numberGrades.remove(index);
		 courseCredits.remove(index);
		
	}
	
	public static double calculateTQP() {
		double TQP=0;
		for (int i = 0; i<numberGrades.size(); i++) {
			double GPAP=0;
			if (numberGrades.get(i)>=95) {
				GPAP=4.0;
			}else if (numberGrades.get(i)>=92) {
				GPAP=3.7;
			}if (numberGrades.get(i)>=87) {
				GPAP=3.3;
			}if (numberGrades.get(i)>=85) {
				GPAP=3.0;
			}if (numberGrades.get(i)>=82) {
				GPAP=2.7;
			}if (numberGrades.get(i)>=77) {
				GPAP=2.3;
			}if (numberGrades.get(i)>=75) {
				GPAP=2.0;
			}if (numberGrades.get(i)>=72) {
				GPAP=1.7;
			}if (numberGrades.get(i)>=67) {
				GPAP=1.3;
			}if (numberGrades.get(i)>=65) {
				GPAP=1.0;
			}if (numberGrades.get(i)>=62) {
				GPAP=0.7;
			}else{
				GPAP=0.0;
			}
			TQP = TQP+(GPAP * courseCredits.get(i));
		}
		return TQP;
	}
	
	
	public static double calculateTCH() {
		double TCH=0;
		for (int i=0; i<courseCredits.size(); i++) {
			TCH=TCH+courseCredits.get(i);
		}
		return TCH;
	}
	
	
	
	
	
	
	
	
	
}
