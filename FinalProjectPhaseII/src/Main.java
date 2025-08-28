import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Student> students = new ArrayList<Student>();
	public static ArrayList<Course> courses = new ArrayList<Course>();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		// CLI interface as a stand-in for the GUI.
		System.out.println("Welcome! Type any menu option to get started. For a list of options type 'h' or 'help'.");
		while (true) {
			try {
				String choice = scanner.nextLine();
				menu(choice);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	// Shows the user their choices and handle their inputs. 
	public static void menu(String choice) {
		if ((choice.equals("help")) || (choice.equals("h"))) {
			// Display a help menu. 
			String help0 = "h | help: displays this page.\n";
			String help1 = "s | student: enter records for a new student.\n";
			String help2 = "e | enroll: enroll a student in a course.\n";
			String help3 = "d | drop: drop a student from a course.\n";
			String help4 = "g | grade: set a student's grade in one of their courses..\n";
			String help5 = "gpa: calculate a student's GPA.\n";
			String help6 = "q | quit: quit.";
			String help = help0 + help1 + help2 + help3 + help4 + help5 + help6;
			System.out.println(help);
		} else if ((choice.equals("student")) || (choice.equals("s"))) {
			// Create a new student. 
			System.out.println("What is the student's name? ");
			String name = scanner.nextLine();
			students.add(new Student(name));
			System.out.println("Student added successfully!");
		} else if ((choice.equals("enroll")) || (choice.equals("e"))) {
			// Creates a new course and enrolls a student in it. 
			// Will also create a new student if their name is not found.
			double numberGrade = 0;
			String letterGrade;
			System.out.println("What is the student's name? ");
			String studentName = scanner.nextLine();
			Student student = findStudent(studentName);
			System.out.println("What is the course's name? ");
			String courseName = scanner.nextLine();
			System.out.println("How many credits is the course worth? ");
			double credits = scanner.nextDouble();
			System.out.println("Does the class have a number grade? Please enter 'true' or 'false'. ");
			boolean hasNumberGrade = scanner.nextBoolean(); 
			if (hasNumberGrade) {
				System.out.println("What is the student's number grade? Values between 0 and 100 only please.");
				numberGrade = scanner.nextDouble();
				scanner.nextLine(); // Clear newlines from buffer to prevent errors. 
				letterGrade = Course.convertNumericGradeToLetter(numberGrade);
			} else {
				scanner.nextLine(); // Clear newlines from buffer to prevent errors. 
				System.out.println("What is the student's letter grade? F to A+ only please.");
				letterGrade = scanner.nextLine();
				numberGrade = Course.convertLetterGradeToNumeric(letterGrade);
			}
			// Create new course and enroll student in it. 
			student.addCourse(courseName, credits, hasNumberGrade, numberGrade, letterGrade);
			System.out.println("Course added successfully!");
		} else if ((choice.equals("drop")) || (choice.equals("d"))) {
			// Drop a student from a course. 
			System.out.println("What is the student's name? ");
			String studentName = scanner.nextLine();
			Student student = findStudent(studentName);
			System.out.println("What is the course's name? ");
			String courseName = scanner.nextLine();
			student.removeCourse(courseName);
			System.out.println("Course dropped successfully!");
		} else if ((choice.equals("grade")) || (choice.equals("g"))) {
			// Calculate a student's GPA. 
			System.out.println("What is the name of the student you want to calculate GPA for? ");
			String studentName = scanner.nextLine();
			Student student = findStudent(studentName);
			System.out.println(studentName + "'s GPA is " + student.getGPA() + ".");
		} else if ((choice.equals("quit")) || (choice.equals("q"))) {
			// Quit.
			scanner.close();
			System.exit(0);
		} else {
			// Error handling.
			System.out.println("Sorry, " + choice + " isn't one of the menu options.");
		}
		System.out.println("Feel free to type another option or type 'h' for help.");
	}
	
	// Attempts to find a student by the specified name. Creates a new one if none exists. 
	public static Student findStudent(String name) {
		for (Student student : students) {
			if (student.name.equals(name)) {
				return student; // Found them!
			} 
		}	
		// If no student by that name exists, make one. 
		System.out.println("No student by that name is in the system yet, creating new record.");
		Student student = new Student(name);
		students.add(student);
		return student; 
	}
}
//}