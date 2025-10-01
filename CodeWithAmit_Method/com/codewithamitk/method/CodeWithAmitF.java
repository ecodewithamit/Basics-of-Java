package com.codewithamitk.method;

public class CodeWithAmitF {
	public static void method1() {
		System.out.println("from method 1");
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		method1();
		System.out.println("............");
		method1();
		System.out.println(".............");
		System.out.println("main end");
	}
}

// method can be called any numbers of times.