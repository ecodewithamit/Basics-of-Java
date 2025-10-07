package com.codewithamitk.multiclass;

public class CodeWithAmitC {
	static int i = 12;

	public static void main(String[] args) {
		System.out.println("from main:" + i);
		System.out.println("from main:" + CodeWithAmitC.i);
	}
}

class CodeWithAmitD {
	public static void main(String[] args) {
		System.out.println("from main:" + CodeWithAmitC.i);
	}
}
