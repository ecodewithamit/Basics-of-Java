package com.codewithamitk.usesofstaticmember;

public class Teacher {
	public static void showStudentCount() {
		System.out.println("Total students : " + School.totalStudents);
		School.displayTotalStudents();
	}

	public static void main(String[] args) {
		showStudentCount();
	}
}
