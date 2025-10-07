package com.codewithamitk.staticvariable;

public class CodeWithAmitO {
	static int i;

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(CodeWithAmitO.i);// optional
		
		CodeWithAmitO.i = 10;
		System.out.println(CodeWithAmitO.i);
	}
}

// Static variable can be initialized / re-initialized using class name also