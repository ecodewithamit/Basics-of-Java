package com.codewithamitk.nonstaticmember;

public class CodeWithAmitC {

	public void non_static_method() {
		static_method();
		System.out.println("non_static_method");
	}

	public static void static_method() {
		non_static_method();
		System.out.println("static_method");
	}
}
