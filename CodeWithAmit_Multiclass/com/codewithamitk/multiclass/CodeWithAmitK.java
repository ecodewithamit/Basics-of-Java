package com.codewithamitk.multiclass;

public class CodeWithAmitK {
	static int i = 10;
	static {
		System.out.println("CodeWithAmitK - SIB");
	}
}

class CodeWithAmitL {
	static {
		System.out.println(" CodeWithAmitL - SIB");
	}
	public static void main(String[] args) {
		System.out.println("CodeWithAmitL main begin");
		System.out.println(CodeWithAmitK.i);
		System.out.println(CodeWithAmitK.i);
		System.out.println(CodeWithAmitK.i);
		System.out.println("CodeWithAmitL main end");
	}
}
