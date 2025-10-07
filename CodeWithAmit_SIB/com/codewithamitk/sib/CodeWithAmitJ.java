package com.codewithamitk.sib;

public class CodeWithAmitJ {
	static int i = method();

	static {
		System.out.println("SIB begin:");
		main(null);
		System.out.println("SIB end:");
	}

	public static int method() {
		System.out.println("method begin");
		main(null);
		System.out.println("method end");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("Main " + i);
	}
}
