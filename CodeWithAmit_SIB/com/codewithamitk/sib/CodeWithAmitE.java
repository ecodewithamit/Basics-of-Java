package com.codewithamitk.sib;

public class CodeWithAmitE {

	static int i ;
	static {
		System.out.println("1-i>" + i);
		i = 2;
		System.out.println("2-i>" + i);
		i = 100;
		System.out.println("3-i>" + i);
	}

	public static void main(String[] args) {
		System.out.println("4-i>" + i);
		i = 10;
		System.out.println("5->i>" + CodeWithAmitE.i);
	}
}
