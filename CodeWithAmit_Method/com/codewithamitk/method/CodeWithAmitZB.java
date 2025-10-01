package com.codewithamitk.method;

public class CodeWithAmitZB {
	public static void method(int i) {
		System.out.println("from method");
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		method(10);
		System.out.println("''''");
		int k = 100;
		method(k);
		System.out.println("main end");
	}
}
