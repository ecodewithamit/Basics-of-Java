package com.codewithamitk.usesofstaticmember;

public class CodeWithAmitG {
	static {
		System.out.println("CodeWithAmitG - SIB");
	}

	public static void main(String[] args) {
		System.out.println("CodeWithAmitG main begin");
		CodeWithAmitF.main(args);
		System.out.println("...........");
		CodeWithAmitF.main(null);
		System.out.println("CodeWithAmitG main end ");
	}
}
