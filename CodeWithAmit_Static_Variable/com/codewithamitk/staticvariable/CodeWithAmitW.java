package com.codewithamitk.staticvariable;

public class CodeWithAmitW {
	static int i = 10;
	static int j = method();

	public static int method() {
		System.out.println("from method");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("From main");
		System.out.println(i);
		System.out.println(j);
	}
}
