package com.codewithamitk.method;

public class CodeWithAmitZA {
	static void method(int i) {
		System.out.println("from method");
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println("form main begin");
		// method();
		method(100);
		System.out.println("from main end");
	}
}