package thirtyDaysOfCode;

import java.util.Scanner;

/*
 * Challenge 8/30 - 30 Days of Code Challenges by HackerRank.com
 * 
 * Task:
 * Given an array A of integers, print 's elements in reverse order as a single line of space-separated numbers.
 * 
 * Input Format:
 * The first line contains an integer, (the size of our array). The second line contains space-separated integers 
 * describing array 's elements.
 * */

public class DaysOfCode7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		// Input
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		scan.close();

		// Output
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
