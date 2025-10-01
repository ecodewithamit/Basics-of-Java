package com.codewithamitk.method;

public class CodeWithAmitW {
	
	public static int test() {
		System.out.println("from test");
		return 0;
	}

	public static void main(String[] args) {
		int i = 10 + test();
		System.out.println(i);
	}
}
