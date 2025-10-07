package com.codewithamitk.multiclass;

public class CodeWithAmitG {
	static {
		System.out.println("CodeWithAmitG - SIB 1");
	}

	public static void main(String[] args) {
		System.out.println("CodeWithAmitG - main");
	}

	static {
		System.out.println("CodeWithAmitG - SIB 2");
	}
}

class CodeWithAmitH {
	static {
		System.out.println("CodeWithAmitH - SIB 1");
	}

	public static void main(String[] args) {
		System.out.println("CodeWithAmitH - main");
	}

	static {
		System.out.println("CodeWithAmitH - SIB 2");
	}
}
