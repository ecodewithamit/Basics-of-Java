package com.codewithamitk.staticvariable;

public class CodeWithAmitX {
	public static int method1() {
		return 1;
	}

	static int i = method1() + method2();

	public static int method2() {
		System.out.println("i->" + i);
		return 2;
	}

	public static void main(String[] args) {
		System.out.println(i);
	}
}
