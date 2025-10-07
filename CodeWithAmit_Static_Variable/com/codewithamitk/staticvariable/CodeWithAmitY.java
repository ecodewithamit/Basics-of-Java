package com.codewithamitk.staticvariable;

public class CodeWithAmitY {
	static int i = 100;
	static int j = method();

	public static int method() {
		return i;
	}

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
	}
}
