package daysOfCode27;

import java.util.Scanner;

// My Solution of the Algorithm of this exercise, not necessarily needed for solving the challenge!

public class Logic {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numTestCases = scan.nextInt();
		int studentsArrived;
		int studentsAttendance;
		int studentsInTime;

		for (int i = 0; i < numTestCases; i++) {
			studentsArrived = scan.nextInt();
			studentsAttendance = scan.nextInt();
			studentsInTime = 0;
			for (int j = 0; j < studentsArrived; j++) {
				if (scan.nextInt() > 0)
					studentsInTime++;
			}
			if (studentsInTime >= studentsAttendance)
				System.out.println("YES");
			else
				System.out.println("No");
		}
		scan.close();

	}
}
