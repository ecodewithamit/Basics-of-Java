package com.codewithamitk.staticvariable;

class CodeWithAmitZ4 {
	static int i = method();

	public static int method() {
		System.out.println("from method");
		return 10;
	}

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(method());
	}
}
