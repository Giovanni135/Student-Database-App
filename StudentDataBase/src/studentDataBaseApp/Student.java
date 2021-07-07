package studentDataBaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
	}
	
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Loop until user hits 0
	public void enroll() {
		do { 
			System.out.print("Enter course to enroll (Press Q to quit) :");
			Scanner in = new Scanner(System.in);
					String course = in.nextLine().toUpperCase();
					if (!course.equals("Q")) {
						courses = courses + "\n" + course;
								tuitionBalance = tuitionBalance + costOfCourse;
					}
					else { 
						break;
					}
		} while (1 !=0);
				System.out.println("ENROLLED IN: " + courses);
				
	}
	public void viewBalance() {
		System.out.println("Your balance is: $ " + tuitionBalance);
	}
	public void payTuition() {
		System.out.print("Enter your payment: $: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + "\nCourses Enrolled:" + courses + "\nBalance: $" + tuitionBalance;
	}
	
}
