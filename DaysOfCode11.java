package thirtyDaysOfCode;

import java.util.Scanner;

/*
 * Context:
 * Given a 6 x 6 2D Array, A: 
 * We define an hourglass in A to be a subset of values with indices falling in this pattern 
 * in A's graphical representation:
 * 
 * a b c
 *   d
 * e f g
 * 
 * There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values. 
 * 
 * Task:
 * Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 * 
 * Input Format:
 * There are lines of input, where each line contains 6 space-separated integers describing 2D Array A;
 * every value in will be in the inclusive range of -9 to 9.
 * 
 */

public class DaysOfCode11 {

	public static void main(String[] args) {

		final int COLSIZE = 6, ROWSIZE = 6;
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[ROWSIZE][COLSIZE];

		// Input
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		scan.close();

		// The minimum sum of an hourglass is 7 x -9 = -63
		int biggest = -1000;

		for (int j = 0; j < ROWSIZE - 2; j++) {
			for (int i = 0; i < COLSIZE - 2; i++) {
				// print out all hourglasses
				// System.out.println(arr[j][i] + "" + arr[j][i + 1] + "" +
				// arr[j][i + 2]);
				// System.out.println(" " + arr[j + 1][i + 1]);
				// System.out.println(arr[j + 2][i] + "" + arr[j + 2][i + 1] +
				// "" + arr[j + 2][i + 2]);
				int newValue = arr[j][i] + arr[j][i + 1] + arr[j][i + 2] + arr[j + 1][i + 1] + arr[j + 2][i]
						+ arr[j + 2][i + 1] + arr[j + 2][i + 2];

				if (newValue > biggest) {
					biggest = newValue;
				}
			}
		}

		System.out.println(biggest);
	}
}
