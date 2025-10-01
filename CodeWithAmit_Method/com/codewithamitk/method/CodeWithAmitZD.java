package com.codewithamitk.method;

public class CodeWithAmitZD {
	public static void method(int i) {
		System.out.println("from method:" + i);
	}

	public static void main(String[] args) {
		int m;
		method(m = 10);
		System.out.println("done");
	}
}
