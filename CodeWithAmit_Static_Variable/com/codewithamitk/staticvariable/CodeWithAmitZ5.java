package com.codewithamitk.staticvariable;

public class CodeWithAmitZ5 {
	static int i = method();

	public static int method() {
		System.out.println("from method");
		main(null);
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println(i);
		method();
	}
}
