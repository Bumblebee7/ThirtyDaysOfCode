package daysOfCode16;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		try {
			int value = Integer.parseInt(str);
			System.out.println(value);
		} catch (Exception e) {
			System.out.println("Bad String");
		} finally {
			scan.close();
		}
	}
}
