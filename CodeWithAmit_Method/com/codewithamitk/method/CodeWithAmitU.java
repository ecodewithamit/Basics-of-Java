package com.codewithamitk.method;

public class CodeWithAmitU {
	static int method() {
		System.out.println("from method");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		method();
		System.out.println("main end");
	}
}
