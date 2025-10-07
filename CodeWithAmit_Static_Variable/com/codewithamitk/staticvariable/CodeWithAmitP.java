package com.codewithamitk.staticvariable;

public class CodeWithAmitP {

	static int i;

	public static void main(String[] args) {
		System.out.println(i);
		i = 10;
		// O.i=10;
		System.out.println(CodeWithAmitP.i);
	}
}
