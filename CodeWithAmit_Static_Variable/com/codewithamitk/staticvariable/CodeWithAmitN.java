package com.codewithamitk.staticvariable;

public class CodeWithAmitN {
	static int i;

	public static void main(String[] args) {
		System.out.println(i);
		int i = 20;
		System.out.println("value of i is:" + i);
		System.out.println(CodeWithAmitN.i);
	}
}

// Local variable gets more preference than global variable. 