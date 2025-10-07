package com.codewithamitk.multiclass;

public class CodeWithAmitM {
	static {
		System.out.println("CodeWithAmitM - SIB");
	}

	static void method() {
		System.out.println("From Method");
	}
}

class CodeWithAmitN {
	public static void main(String[] args) {
		System.out.println("...............");
		CodeWithAmitM.method();
		CodeWithAmitM.method();
		CodeWithAmitM.method();
		System.out.println(".................");
	}

	static {
		System.out.println("CodeWithAmitN - SIB");
	}
}