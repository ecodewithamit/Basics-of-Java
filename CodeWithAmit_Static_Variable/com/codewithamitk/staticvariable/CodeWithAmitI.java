package com.codewithamitk.staticvariable;

public class CodeWithAmitI {
	static int i;

	static void test() {
		System.out.println("FROM TEST :" + i);
		i = 10;
	}

	public static void main(String[] args) {
		System.out.println("main1:" + i);
		i = 20;
		test();
		System.out.println("MAIN2:" + i);
	}
}


//static variable can be initialize any where in a class and outside the class using
//Class name.