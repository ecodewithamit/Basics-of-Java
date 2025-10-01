package com.codewithamitk.method;

public class CodeWithAmitZE {
	public static void method(int i, int j) {
		System.out.println("i =" + i + ",j=" + j);
	}

	public static void main(String[] args) {
		method(10, 20);
		int i = 200;
		method(i, 500);
		method(200, i);
		method(i, i);
		System.out.println("done");
	}
}
