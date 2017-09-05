package daysOfCode01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DaysOfCode1 {

	/*
	 * Challenge 2/30 - 30 Days of Code Challenges by HackerRank.com
	 * 
	 * Raad three different types of input from stdin and add them to a second
	 * variable of the same type. Then print them out.
	 */

	public static void main(String[] args) {

		int i = 4;
		double d = 4.0;
		String s = "HackerRank is ";
		Scanner scan = new Scanner(System.in);
		double e = 0;

		System.out.println("INT");
		// System.out.println(scan.hasNextInt());
		int j = scan.nextInt();

		System.out.println("STRING");
		// System.out.println(scan.hasNext());
		String t = scan.next();

		System.out.println("DOUBLE (Use komma to seperate not a dot!)");
		// System.out.println(scan.hasNextDouble());
		try {
			e = scan.nextDouble();
		} catch (InputMismatchException exe) {
			System.out.println("You must use Komma to seperate a decimal number!");
			System.out.println("I have set e to 0,0 for you.");
			// exe.printStackTrace();
		}

		/* Print the sum of both integer variables on a new line. */
		int sum = j + i;
		System.out.println(j + " + " + i + " = " + sum);
		System.out.println("(If you try du calculate in output: " + j + i + ")");

		/* Print the sum of the double variables on a new line. */
		double sum2 = d + e;
		System.out.println(sum2 + " (If you try du calculate in output: " + d + e + ")");

		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println(s + t);

		scan.close();
	}

}
