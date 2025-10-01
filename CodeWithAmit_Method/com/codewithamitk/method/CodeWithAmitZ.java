package com.codewithamitk.method;

public class CodeWithAmitZ {
	public static int method1() {
		System.out.println("from method1");
		return 10;
	}

	public static int method2() {
		System.out.println("from method2");
		return method1();
	}

	public static int method3() {
		System.out.println("from method3");
		return method1() + method2();
	}

	public static void main(String[] args) {
		System.out.println(method1());
		System.out.println(method2());
		System.out.println(method3());
	}
}
// A method can be called from any other method 
