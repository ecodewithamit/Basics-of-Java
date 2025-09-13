
public class Comments {
	public static void main(String[] args) {
		// This is a single-line comment
		System.out.println("Single line comment.");
		System.out.println(2+5); //7
		
		System.out.println("***********************************");
		
		/* This is a multi-line comment   
		It can span across lines */
		 
		/* 
		This is a multi-line comment   
		It can span across lines 
		*/
		System.out.println("This is a multi-line comment.");
		
		System.out.println("***********************************");
	}
	
	
	/**
	 * Adds two integers.
	 *
	 * @param a first number to add
	 * @param b second number to add
	 * @return sum of a and b
	 */
	public int add(int a, int b) {
		return a + b;
	}

}
