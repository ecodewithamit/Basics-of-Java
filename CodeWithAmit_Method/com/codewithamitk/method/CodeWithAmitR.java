package com.codewithamitk.method;

public class CodeWithAmitR {
	public static int method() {
		System.out.println("from test");
		return 1;
	}

	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println(method());
		method();
	}
}
