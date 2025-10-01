package com.codewithamitk.method;

public class CodeWithAmitL {
	public static void method() {
		System.out.println("from method");
		return;
	}

	public static void main(String[] args) {
		method();
		System.out.println(".........");
		method();
	}
}
// If the method return type is defined as void then return statement is optional.