package com.codewithamitk.nonstaticmember;

public class CodeWithAmitB {
	
	public void non_static_method () {
		System.out.println("non_static_method");
	}
	
	public static void static_method () {
		System.out.println("static_method");
	}
	
	public static void main(String[] args) {
		static_method();
		non_static_method();
		System.out.println("hello world");
	}
}