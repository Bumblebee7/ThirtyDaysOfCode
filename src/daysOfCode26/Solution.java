package daysOfCode26;

import java.util.Scanner;

// quick and dirty

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int ActualDay = scan.nextInt();
		int ActualMonth = scan.nextInt();
		int ActualYear = scan.nextInt();

		int ExpectedDay = scan.nextInt();
		int ExpectedMonth = scan.nextInt();
		int ExpectedYear = scan.nextInt();
		scan.close();

		// calculate fine
		int fine = 0;
		if (ActualYear > ExpectedYear)
			fine = 10000;
		else if (ActualYear == ExpectedYear) {
			if (ActualMonth > ExpectedMonth)
				fine += (Math.abs(ExpectedMonth - ActualMonth) * 500);
			else if (ActualDay > ExpectedDay)
				fine += (Math.abs(ExpectedDay - ActualDay) * 15);
		}
		System.out.println(fine);
	}
}
