package com.corejava.controlstatement;

/**
 * Example program of IF-ELSE control statement that prints grade of a Student
 * on the basis of his marks
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 * 
 */
public class StudentsGrade {

	public static void main(String[] args) {

		// Marks of Student
		int marks = 80;

		if (marks >= 90) {
			System.out.println("Grade A ");
		} else if (marks >= 80) {
			System.out.println("Grade B ");
		} else if (marks >= 70) {
			System.out.println("Grade C ");
		} else if (marks >= 60) {
			System.out.println("Grade D ");
		} else {
			System.out.println("Grade F ");
		}
	}

}
