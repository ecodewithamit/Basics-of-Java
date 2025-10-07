package com.codewithamitk.sib;

public class CodeWithAmitG {
	static String appName;
	static String version;

	static {
		System.out.println("Loading App Configuration...");
		appName = "CodeWithAmit App";
		version = "1.0.0";
	}

	public static void showConfig() {
		System.out.println("App Name: " + appName);
		System.out.println("Version: " + version);
		
	}
	
	public static void main(String[] args) {
        System.out.println("Main started.");
        CodeWithAmitG.showConfig();
        System.out.println("Main Ended.");
    }
}
