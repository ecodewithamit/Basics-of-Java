package com.codewithamitk.method;

public class CodeWithAmitS {
	public static int method() {
		System.out.println("from test");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("from main begin");
		int i = method();
		System.out.println(i);
		System.out.println("from main eng");
	}
}
