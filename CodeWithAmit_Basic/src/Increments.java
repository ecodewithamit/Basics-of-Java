
public class Increments {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println("*************1*************");

		int b = 5;
		System.out.println(--b);
		System.out.println(b--);
		System.out.println(b);

		System.out.println("*************2*************");
		int i = 1;
		i++;
		System.out.println(i++);
		System.out.println(i);

		System.out.println("*************3*************");
		int j = 1;
		int k = j;
		System.out.println(j);
		System.out.println(k);
		System.out.println(k++);
		System.out.println(k);

		System.out.println("*************4*************");
		int m = 0;
		int n = m++ + m;
		System.out.println(m);
		System.out.println(n);

	}
}
