public class BreakAndContinue {
	public static void main(String[] args) {
		System.out.println("########### Break Statement ###############");
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break; // stop the loop when i = 3
			}
			System.out.println(i);
		}

		System.out.println("########### Continue Statement ###############");
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue; // skip when i = 3
			}
			System.out.println(i);
		}
		
		System.out.println("#### Break and Continue Statement ####");
		for (int i = 0; i < 6; i++) {
			if (i == 2) {
				continue;
			}
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
	}
}
