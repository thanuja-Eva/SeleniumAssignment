package com.HA.Student;

public class StudentDetails {

	private int studentRollNo;
	private String studentName;
	private String studentMailId;
	private double studentPercentage;
	private static String schoolName;

	public static void main(String[] args) {

		StudentDetails student1 = new StudentDetails();
		student1.studentRollNo = 1001;
		student1.studentName = "jack";
		student1.studentMailId = "jack@gmail.com";
		student1.studentPercentage = 45.2;
		StudentDetails.schoolName = "Global school";

		StudentDetails student2 = new StudentDetails();
		student2.studentRollNo = 1002;
		student2.studentName = "peter";
		student2.studentMailId = "peter@gmail.com";
		student2.studentPercentage = 85.2;

		StudentDetails student3 = new StudentDetails();
		student3.studentRollNo = 1003;
		student3.studentName = "mark";
		student3.studentMailId = "mark@gmail.com";
		student3.studentPercentage = 56.5;

		System.out.println(student1.studentRollNo + " " + student1.studentName + " " + student1.studentMailId + " "
				+ student1.studentPercentage + " " + schoolName);
		System.out.println(student2.studentRollNo + "" + student2.studentName + student2.studentMailId + ""
				+ student2.studentPercentage + schoolName);
		System.out.println(student3.studentRollNo + "" + student3.studentName + student3.studentMailId + ""
				+ student3.studentPercentage + schoolName);

	}

}
