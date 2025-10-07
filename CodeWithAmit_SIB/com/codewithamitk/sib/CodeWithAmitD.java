package com.codewithamitk.sib;

public class CodeWithAmitD {
	static int i;
	static {
		System.out.println(" SIB i->" + i);
		i = 2;
	}

	public static void main(String[] args) {
		System.out.println(i);
	}
}

/*
First of all static variable i is initialized with default value zero
then inside SIB block i value is getting modified with 2
*/
