public class IfElseIfElse{
		public static void main(String[] args){
			System.out.println("############# Weather check ##############");
			int rain = 0; // 0 = no rain, 1 = light rain, 2 = heavy rain
			if (rain == 2) {
				System.out.println("Take a raincoat.");
			} else if (rain == 1) {
				System.out.println("Take an umbrella.");
			} else {
				System.out.println("Enjoy the sunshine!");
			}
			
			
			
			
			
			
			
			System.out.println("############# Grading System ##############");
			int marks = 75;

			if (marks >= 90) {
				System.out.println("Grade A");
			} else if (marks >= 75) {
				System.out.println("Grade B");
			} else if (marks >= 50) {
				System.out.println("Grade C");
			} else {
				System.out.println("Fail");
			}
			
			
			
			
			
			
			
			System.out.println("############# Age Check ##############");
			int age = 16;

			if (age >= 18) {
				System.out.println("You can vote.");
			} else if (age >= 13) {
				System.out.println("You are a teenager.");
			} else {
				System.out.println("You are a child.");
			}
			
			
			
			
			
			
			System.out.println("############# Number check ##############");
			int number = -5;

			if (number > 0) {
				System.out.println("Positive number");
			} else if (number < 0) {
				System.out.println("Negative number");
			} else {
				System.out.println("Zero");
			}
			
		}
}