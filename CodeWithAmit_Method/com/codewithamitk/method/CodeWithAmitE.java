package com.codewithamitk.method;

public class CodeWithAmitE {
	public static void method1() {
		System.out.println("from method 1");
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		method1();
		method2();
		System.out.println("main end");
	}

	public static void method2() {
		System.out.println("from method 2");
	}
}

//Method Without Parameters (No Input)
//Calling a static method by its name.