package com.codewithamitk.method;

public class CodeWithAmitZF {
	public static void method(int i) {
		System.out.println("method" + i);
		i = 10;
	}

	public static void main(String[] args) {
		int i = 20;
		System.out.println("main begin:" + i);
		method(i);
		System.out.println("main end");
	}
}


