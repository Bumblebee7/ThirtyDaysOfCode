package daysOfCode29;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int begin;
		int end;
		int max;

		for (int i = 0; i < times; i++) {
			end = scan.nextInt();
			begin = scan.nextInt();
			max = 0;

			// Evaluate
			for (int j = 1; j < end; j++) {
				for (int k = end; k > j; k--) {
					// System.out.println(i + " & " + j);
					int compare = j & k;
					if (max < compare && compare < begin)
						max = compare;
				}
			}
			System.out.println(max);
		}
		scan.close();
	}
}
