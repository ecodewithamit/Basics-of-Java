package com.codewithamitk.staticvariable;

public class CodeWithAmitZ {
	static int i = method();
	static int j = 15;

	public static int method() {
		System.out.println("From method ->i" + i);
		System.out.println("From method ->j" + j);
		return j;
	}

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
	}
}
