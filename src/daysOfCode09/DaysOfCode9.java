package daysOfCode09;

import java.util.Scanner;

/*
 * Task:
 * Write a factorial function that takes a positive integer, N as a parameter and prints the result of N!(N factorial).
 * 
 * Input Format:
 * A single integer, N (the argument to pass to factorial).
*/

public class DaysOfCode9 {

	public static int factorial(int n) {
		if (n > 1) // call next step of recursion
			return (n * factorial(n - 1));
		else // to end the recursion
			return n;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		int result = factorial(num);
		System.out.println(result);
	}

}
