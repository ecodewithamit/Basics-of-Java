package com.codewithamitk.usesofstaticmember;

public class CodeWithAmitA {
	static int i;

	static void method() {
		System.out.println("from method:" + i);
	}
}

class CodeWithAmitB {
	public static void main(String[] args) {
		System.out.println("from main:" + CodeWithAmitA.i);
		CodeWithAmitA.method();
	}
}