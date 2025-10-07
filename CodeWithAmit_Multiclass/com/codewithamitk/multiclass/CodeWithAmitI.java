package com.codewithamitk.multiclass;

class CodeWithAmitI {
	static {
		System.out.println("CodeWithAmitI - SIB");
	}

	public static void main(String[] args) {
		System.out.println("CodeWithAmitI - main");
	}
}

class CodeWithAmitJ {
	static {
		System.out.println("CodeWithAmitJ - SIB");
	}

	public static void main(String[] args) {
		System.out.println("CodeWithAmitJ - main - begin ");
		CodeWithAmitI.main(args);
		System.out.println("CodeWithAmitJ - main - end ");
	}
}
