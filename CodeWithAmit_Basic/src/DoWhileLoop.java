
public class DoWhileLoop {
	public static void main(String[] args) {
		System.out.println("## Printing one to 10 ##");
		int i = 1; // start from 1

		do {
			System.out.println(i);
			i++;
		} while (i <= 10); // stop when i > 10

		System.out.println("## Printing event number ##");
		int j = 2; // start from first even number

		do {
			System.out.println(j);
			j += 2; // jump by 2
		} while (j <= 20); // stop when i > 20
	}
}
