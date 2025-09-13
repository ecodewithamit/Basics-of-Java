public class TernaryOperator {
    public static void main(String[] args) {
        
        // Example 1: Voting Age
        int age = 16;
        String voteResult = (age >= 18) ? "You can vote" : "You cannot vote";
        System.out.println("Voting check: " + voteResult);

        
		
		
		
		
		
		// Example 2: Positive or Negative
        int num = -5;
        String signResult = (num >= 0) ? "Number is positive" : "Number is negative";
        System.out.println("Sign check: " + signResult);

        
		
		
		
		
		// Example 3: Pass or Fail
        int marks = 35;
        String examResult = (marks >= 40) ? "You Passed" : "You Failed";
        System.out.println("Exam result: " + examResult);

        
		

		
		// Example 4: Even or Odd
        int n = 7;
        String evenOddResult = (n % 2 == 0) ? "Even number" : "Odd number";
        System.out.println("Number check: " + evenOddResult);
    }
}
