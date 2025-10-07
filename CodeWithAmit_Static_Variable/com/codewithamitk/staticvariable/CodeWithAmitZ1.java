package com.codewithamitk.staticvariable;

public class CodeWithAmitZ1 {
	static int i = method();

	public static int method() {
		System.out.println("from method");
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println(i);
		System.out.println("main end");
	}
}
