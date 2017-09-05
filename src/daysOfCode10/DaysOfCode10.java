package daysOfCode10;

import java.util.Scanner;

/*
 * Task:
 * Print out the total number of consecutive 1. Use the binary representation of a integer value.
 * 
 * Input:
 * A single positive integer value (The method countBin() works with negative integers also).
 */

public class DaysOfCode10 {

	// solution #1
	public static void countBin(int num) {

		// Concat the String with 0 to get easy access to the last char in the
		// Array
		String binaryStr = (Integer.toBinaryString(num) + "0");
		char[] binaryArr = binaryStr.toCharArray();
		// total amount of consecutive '1'
		int amount = 0;

		// iterate through the array of chars until you find a leading '1'
		for (int k = 0; k < binaryArr.length; k++) {
			if (binaryArr[k] == '1') {
				System.out.println("Found a new leading \'1\' at position " + k + "!");
				int counter = 1;

				// search for following '1'
				for (int i = k + 1; i < binaryArr.length; i++) {

					if (binaryArr[i] == '1') {
						counter++;
					} else {
						k = i;
						break;
					}
				}
				// > 1 in a row means consecutive
				if (counter > 1)
					amount += counter;
			}
		}
		System.out.printf("The exact number of consecutive \'1\' is %d.", amount);
		System.out.println("\n");
	}

	// solution #2
	private static void calculateBin(int num) {
		int count = 0, min = 0;
		while (num > 0) {

			if (num % 2 == 1) {

				count++;
				if (count >= min) {
					min += count;
				}
			} else {
				count = 0;
			}

			num /= 2;
		}
		System.out.println(min);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		System.out.println("Vergleichswert: " + Integer.toBinaryString(num) + "\n");
		System.out.println("The obvious way:");
		countBin(num);
		System.out.println("The mathematically way:");
		calculateBin(num);
	}
}
