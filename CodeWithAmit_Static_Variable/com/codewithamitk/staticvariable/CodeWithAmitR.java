package com.codewithamitk.staticvariable;

public class CodeWithAmitR {
	static int i = 10;
	static int j = i;

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
	}
}
/*
Uses of i is proper with forward reference.
i.e we are initializing the i value to j
 */
