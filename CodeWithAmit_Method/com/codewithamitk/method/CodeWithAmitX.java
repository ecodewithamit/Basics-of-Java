package com.codewithamitk.method;

public class CodeWithAmitX {
	public static int test() {
		int i = 10;
		return i;
	}

	public static void main(String[] args) {
		test();
		System.out.println(test());
		System.out.println(test() + test());
	}
}
