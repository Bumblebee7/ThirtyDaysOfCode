package daysOfCode25;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] values = new int[num];
		for (int i = 0; i < num; i++) {
			values[i] = scan.nextInt();
		}
		scan.close();

		isPrime(values);
	}

	public static void isPrime(int[] values) {

		for (int a : values) {
			if (a <= 1)
				System.out.println("Not prime");
			else if (a == 2)
				System.out.println("Prime");
			else {
				boolean isPrime = true;
				for (int i = 2; i <= Math.sqrt(a); i++) {
					if (a % i == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime)
					System.out.println("Prime");
				else
					System.out.println("Not prime");
			}
		}
	}
}
