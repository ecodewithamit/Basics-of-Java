package com.codewithamitk.sib;

public class CodeWithAmitF {
	static String screenType;
	static int totalSeats;

	static {
		System.out.println("Setting up cinema hall...");
		screenType = "4K Ultra HD";
		totalSeats = 200;
	}

	public static void main(String[] args) {
		System.out.println(screenType);
		System.out.println(totalSeats);
	}
}