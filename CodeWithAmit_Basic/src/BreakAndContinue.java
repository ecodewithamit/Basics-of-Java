public class BreakAndContinue {
	public static void main(String[] args) {

		System.out.println("########### Break Statement ##############");
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				System.out.println("Key found in drawer no" + i);
				break;
			}
			System.out.println("Drawer no" + i + " → key Not found");
		}
		
		System.out.println("########### Continue Statement ##############");
		for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Student " + i + " is absent. Skipping...");
                continue;
            }
            System.out.println("Student " + i + " is present.");
        }
	}
}
