package com.codewithamitk.method;

public class CodeWithAmitQ {
	public static void main(String[] args) {
		System.out.println("######## Main begins ########");
		methodTest();
		System.out.println("######## Main begins ########");
	}

	public static void methodTest() {
		if (false) {
			return;
			// System.out.println("hello world");
			// unreachable statment.
		}
		System.out.println("from end");
	}
}
