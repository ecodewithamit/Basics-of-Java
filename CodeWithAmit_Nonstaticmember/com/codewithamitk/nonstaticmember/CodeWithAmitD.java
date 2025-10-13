package com.codewithamitk.nonstaticmember;

public class CodeWithAmitD {
	
	static int i;
	
	public void non_static_method() {
		System.out.println("non_static_method");
	}

	public static void static_method() {
		System.out.println("static_method");
	}
	
	static {
		System.out.println(i);
		static_method();
		non_static_method();
	}
}