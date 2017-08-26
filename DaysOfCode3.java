package thirtyDaysOfCode;

import java.util.Scanner;

/*
 * Challenge 4/30 - 30 Days of Code Challenges by HackerRank.com
 * 
 * If a number is odd print weird
 * if a number is even and in between 2 & 5 print not weird
 * if a number is even and in between 6 & 20 print weird
 * if a number is even an greater than 20 print not weird
 * 
 * Input Format
 * A single line containing a positive integer, .
 */

public class DaysOfCode3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if (n % 2 == 1)
			ans = "Weird";
		else if (n % 2 == 0 && n >= 2 && n <= 5)
			ans = "Not Weird";
		else if (n % 2 == 0 && n >= 6 && n <= 20)
			ans = "Weird";
		else if (n % 2 == 0 && n > 20)
			ans = "Not Weird";

		System.out.println(ans);
	}
}
