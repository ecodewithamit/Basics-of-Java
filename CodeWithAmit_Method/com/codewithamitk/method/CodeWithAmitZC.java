package com.codewithamitk.method;

public class CodeWithAmitZC {
	public static void method(int i) {
		System.out.println("from method:" + i);
	}

	public static void main(String[] args) {
		method(100);
		int k = 200;
		method(k);
		method(k + 300);
		int m = 1;
		method(m);
		System.out.println("done");
	}
}
