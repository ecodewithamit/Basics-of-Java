package com.codewithamitk.method;

public class CodeWithAmitT {
	public static int method() {
		System.out.println("from test");
		return 10;
	}

	public static void main(String[] args) {
		int i = method();
		int j = 10 + method();
		System.out.println(method());
		System.out.println(i);
		System.out.println(j);
		System.out.println(i + j + method());
	}
}
