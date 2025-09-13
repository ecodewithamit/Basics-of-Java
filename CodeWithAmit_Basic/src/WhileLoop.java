public class WhileLoop{
	public static void main(String[] args) {
		
		System.out.println("Printing 0 to 10 ");
		int i=0;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("**** Countdown Timer ****");
		int count = 5;
		while (count > 0) {
		    System.out.println("Countdown: " + count);
		    count--;
		}
		System.out.println("Time's up!");
	}	
}