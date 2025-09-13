public class NestedIfElse {
		public static void main(String[] args){
			
			System.out.println("############## Voting Eligibility check ##################");
			int age = 20;
			boolean hasVoterId = true;

			if (age >= 18) {
				if (hasVoterId) {
					System.out.println("You can vote.");
				} else {
					System.out.println("Get a voter ID first.");
				}
			} else {
				System.out.println("You are not old enough to vote.");
			}
			
			
			
			
			
			
			System.out.println("############## ATM Withdrawal ##################");
			int balance = 5000;
			int withdraw = 2000;

			if (balance >= withdraw) {
				if (withdraw <= 10000) {
					System.out.println("Withdrawal successful!");
				} else {
					System.out.println("Limit exceeded.");
				}
			} else {
				System.out.println("Insufficient balance.");
			}

			
			
			
			
			
			
			
			
			System.out.println("############## Exam Result ##################");
			int marks = 85;
			if (marks >= 50) {
				if (marks >= 90) {
					System.out.println("Excellent!");
				} else {
					System.out.println("You passed.");
				}
			} else {
				System.out.println("You failed.");
			}

		}
}