package thirtyDaysOfCode;

import java.util.Scanner;

/*
 * Challenge 6/30 - 30 Days of Code Challenges by HackerRank.com
 * 
 * Task:
 * Given an integer, n , print its 10 first multiples. Each multiple should be printed on a new line in the form: n x i = result.
 * 
 * Input Format:
 * A single integer, n.
 */

public class DaysOfCode5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}

		scan.close();
	}
}
