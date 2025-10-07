package com.codewithamitk.staticvariable;

public class CodeWithAmitD {
	static int i;
	static int j;

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		i = 10;
		j = 20;
		System.out.println(i);
		System.out.println(j);
	}
}

// Global static variable can be reinitialized again and again