package com.codewithamitk.sib;

public class CodeWithAmitH {
	static int i;
	static int j = 100;
	static {
		i = j;
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		System.out.println(i);
		System.out.println(j);
	}
}