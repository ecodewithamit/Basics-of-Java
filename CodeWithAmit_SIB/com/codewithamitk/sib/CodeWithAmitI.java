package com.codewithamitk.sib;

public class CodeWithAmitI {

	static {
		System.out.println("SIB1");
	}

	public static int method() {
		System.out.println("method -i-->" + i);
		return 10;

	}

	public static void main(String[] args) {
		System.out.println("done");
		System.out.println(i);
	}

	static int i = method();
	static {
		System.out.println("SIB2");
	}
}

/*
All the SIB will executes top to bottom before execution of the main method.
*/
