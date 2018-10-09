import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		// this is an example of a single line comment
		// here is another line

		/*
		 * This is a multi-line comment
		 */

		System.out.print("Hello");
		System.out.print("World\n");

		// this is a Scanner object
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int userAge = scan.nextInt();
		System.out.println(userAge);

		// garbage line to clean out my scanner
		// necessary when going from a numeric type to
		// scan.nextLine()
		scan.nextLine();

		System.out.println("Please enter your first and last name:");
		String userName = scan.nextLine();
		System.out.println(userName);

		// primitive data types
		byte b = 127;
		short s = 128;
		int i = 133333;
		long l = 4564564565653L;
		float f = (float) 56.7; // can use lowercase f or F as well like long
		double d = 56.7;
		char c = '@';
		boolean bool = true;

		// this is a constant and can not change
		final String TEST = "hello";
		// TEST= "no way"; we can't do this!

		System.out.println(9 % 5); // modulus returns the remainder

		s++; // post increment
		s--;

		++s; // pre-increment

		String words = "this is a sentence";
		words += " and I added some words...";
		System.out.println(words);

		int nums = 5;
		nums += 12;
		System.out.println(nums); // same as nums = nums + 12;

		// implicit casting example
		// java does this for us automatically
		int age = 35;
		double myAge = age;
		System.out.println(myAge);

		// explicit casting
		// when going from a more precise data type to less precise
		double shoppingTotal = 258.54;
		int newTotal = (int) shoppingTotal; // truncates anything past the decimal point
		System.out.println(newTotal);

		// You should close the scanner at the very end of the program
		scan.close();

	}

}
