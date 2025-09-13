
public class Operator {
	public static void main(String[] args) {
		System.out.println("########### Arithmetic Operators #############");
		int a = 10, b = 3;
		System.out.println(a + b); // 13
		System.out.println(a - b); // 7
		System.out.println(a * b); // 30
		System.out.println(a / b); // 3
		System.out.println(a % b); // 1
		
		System.out.println("############ Logical Operators ############");
		int age = 20;
		System.out.println(age > 18 && age < 30); // true
		System.out.println(age < 18 || age > 30); // false
		System.out.println(!(age > 18));          
		
		System.out.println("######### Assignment Operators ###########");
		int num = 10;
		num = num + 5 ;
		System.out.println(num);
		
		num = num - 3;
		System.out.println(num);
		
		num = num * 3;
		System.out.println(num);
		
		num = num /3;
		System.out.println(num);
		
		System.out.println("######### Relational Operators ###########");
		int x = 5, y = 8;
		System.out.println(x == y); 
		System.out.println(x > y); 
		System.out.println(x < y); 
		System.out.println(x >= y); 
		System.out.println(x <= y); 
		System.out.println(x != y);

	}
}
