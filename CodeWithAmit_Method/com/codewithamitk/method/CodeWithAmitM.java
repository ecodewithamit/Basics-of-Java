package com.codewithamitk.method;

public class CodeWithAmitM {
	public static void method() {
		System.out.println("test begin");
		if (false) {
			System.out.println("from if");
			return;
		}
		System.out.println("test end");
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		method();
		System.out.println("main end");
	}
}
