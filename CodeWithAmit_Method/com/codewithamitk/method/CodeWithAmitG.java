package com.codewithamitk.method;

public class CodeWithAmitG {
	public static void method1() {
		System.out.println("I am from CodeWithAmitG@method 1");
	}

	public static void method2() {
		System.out.println("method2 begin");
		method1();
		System.out.println("method2 end");
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		method1();
		method2();
		System.out.println("main end");
	}
}

// A method can be called another method.