
public class ForLoop {
	public static void main(String[] args) {
		
		
		System.out.println("1. #### Without for loop ####");
		System.out.println("@codewithamitk");
		System.out.println("@codewithamitk");
		System.out.println("@codewithamitk");
		System.out.println("@codewithamitk");
		System.out.println("@codewithamitk");
		System.out.println("@codewithamitk");
		System.out.println("@codewithamitk");
		System.out.println("@codewithamitk");
		System.out.println("@codewithamitk");
		System.out.println("@codewithamitk");
		
		
		
		
		System.out.println("2. ## With For loop ##");
		for (int i = 0; i < 10; i++) {
			System.out.println("Amit kumar");
		}
		
		
		
		
		System.out.println("3. ##### Print Number from 1 to 5 ########");
		for(int i = 1; i <= 5; i++) {
		    System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		System.out.println("4. ## Print Even Numbers from 2 to 10 ##");
		for(int i = 2; i <= 10; i += 2) {
		    System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println("5. ## Inside the for loop initialization part is optional");
		int i = 0;
		for (; i < 10; i++) {
			System.out.println("Amit kumar");
		}
		
		
		
		
		
		
		
		System.out.println("6. ## Calculate Sum of First 10 Natural Numbers ##");
		int sum = 0;
		for(int j = 1; i <= 10; i++) {
		    sum = sum + j;
		}
		System.out.println("Sum = " + sum);
		
		
		
		
		
		
		
		
		System.out.println("7. ###################################################");
		int k = 0;
		for (System.out.println("Java"),System.out.println("Tech "); k < 5; k++) {
			System.out.println("CODE WITH AMIT");
			System.out.println("************");
		}
		
		
		
		
		
		
		
		System.out.println("8. *************************************************");
		for (int p=0 /*,double d = 10.8*/; p < 5; p++) {
			System.out.println("****** More than one initialization of diff type"
					+ " are not possible ******");
		}
		
		
		
		
		
		System.out.println("9. *************************************************");
		for (int q=0,r=20; q < 5; q++) {
			System.out.println("Declaring two variables of the same data type  are possible");
		}
		
		
		
		
		
		
		
		
		System.out.println("10. *************************************************");
		for (int r = 0;; r++) {
			System.out.println("inside the for loop conditional part is optional");// infinite loop
			if(r==5){
				System.out.println("********************");
				break;
			}
		}
		
		
		
		System.out.println("11. ********************* Nested for loop ****************************");
		// Outer loop.
		for (int m = 1; m <= 2; m++) {
			System.out.println("Outer: " + m); // Executes 2 times

			// Inner loop
			for (int j = 1; j <= 3; j++) {
				System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
			}
		}

	}
}
