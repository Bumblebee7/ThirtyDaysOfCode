package thirtyDaysOfCode;

import java.util.Scanner;

public class DaysOfCode10 {

	public static void countBin(int n) {

		System.out.println("Vergleichswert: " + Integer.toBinaryString(n));

		// Concat the String with 0 to get easy access to the last char in the
		// Array
		String binaryStr = (Integer.toBinaryString(n) + "0");
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
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		countBin(num);
	}
}
