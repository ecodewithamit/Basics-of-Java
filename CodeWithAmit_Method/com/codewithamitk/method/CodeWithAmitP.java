package com.codewithamitk.method;

public class CodeWithAmitP {
	public static void main(String[] args) {
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}

	public static void test() {
		if (100 == 100) {
			System.out.println("from test");
			return;
		}
		System.out.println("####### This will not execute ########");
	}
}
