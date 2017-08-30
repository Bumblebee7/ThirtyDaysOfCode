package thirtyDaysOfCode;

import java.util.Scanner;

public class DaysOfCode11 {

	public static void main(String[] args) {
		final int COLSIZE = 6, ROWSIZE = 6;
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[ROWSIZE][COLSIZE];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		scan.close();

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
