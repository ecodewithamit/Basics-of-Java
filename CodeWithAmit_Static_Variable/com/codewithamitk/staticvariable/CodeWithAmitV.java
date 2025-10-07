package com.codewithamitk.staticvariable;

public class CodeWithAmitV {
	static int i = 10;
	static int j = i;
	static int m = n;
	
	static int n = j;

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		// System.out.println(m);
		System.out.println(n);
	}
}

// java does not support illegal forward reference variable