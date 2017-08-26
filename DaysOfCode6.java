package thirtyDaysOfCode;

import java.util.Scanner;

public class DaysOfCode6 {

	/*
	 * Challenge 7/30 - 30 Days of Code Challenges by HackerRank.com
	 * 
	 * Task: Given a string, S, of length N that is indexed from 0 to N - 1,
	 * print its even-indexed and odd-indexed characters 2 as space-separated
	 * strings on a single line
	 * 
	 * Input Format: The first line contains an integer, T (the number of test
	 * cases). Each line i of the T subsequent lines contain a String, S.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		scan.nextLine();

		while (times > 0) {

			String str = scan.nextLine();
			char arr[] = str.toCharArray();
			int len = str.length();

			// Even numbers
			for (int x = 0; x < len; x = x + 2) {
				System.out.print(arr[x]);
			}
			System.out.print(" ");

			// Odd numbers
			for (int x = 1; x < len; x = x + 2) {
				System.out.print(arr[x]);
			}
			System.out.println();

			times--;
		}
		scan.close();
	}
}
