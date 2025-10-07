package com.codewithamitk.staticvariable;

public class CodeWithAmitU {
	static int i =j;
	static int j = 10;
	
	public static void main(String[] args) {
		// System.out.println(i);
		System.out.println(j);
	}
}
//java does not support the illegal forward reference.
//Cannot reference a field before it is defined.