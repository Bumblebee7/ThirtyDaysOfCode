package daysOfCode20;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();

		int numOfSwaps = 0;
		// BubbleSort
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					numOfSwaps++;
				}
			}
			if (numOfSwaps == 0)
				break;
		}

		System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
		/*
		 * for(int i : a) System.out.print(i + " ");
		 */
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);
	}
}