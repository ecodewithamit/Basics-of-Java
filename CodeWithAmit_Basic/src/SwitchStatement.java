public class SwitchStatement {
	public static void main(String[] args) {

		System.out.println("######### Day of the Week ############");
		int day = 3;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day");
		}

		
		
		
		
			
		System.out.println("######### Traffic Light ############");

		String signal = "red";
		switch (signal) {
		case "red":
			System.out.println("Stop!");
			break;
		case "yellow":
			System.out.println("Get Ready!");
			break;
		case "green":
			System.out.println("Go!");
			break;
		default:
			System.out.println("Invalid signal");
		}

		
		
		
		
		
		
		System.out.println("######### Grade System ############");
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Needs Improvement");
			break;
		default:
			System.out.println("Fail");
		}

	}
}
