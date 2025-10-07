package com.codewithamitk.usesofstaticmember;

public class School {
	
	// Static variable shared across all classes
	public static int totalStudents = 500;

	// Static method
	public static void displayTotalStudents() {
		System.out.println("Total students in school: " + totalStudents);
	}
}
