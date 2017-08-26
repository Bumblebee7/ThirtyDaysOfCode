package thirtyDaysOfCode;

import java.util.Scanner;

/*
 * Challenge 5/30 - 30 Days of Code Challenges by HackerRank.com
 * 
 * Task:
 * Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter.
 * The constructor must assign initialAge to after confirming the argument passed as initialAge is not negative; if a negative
 *  argument is passed as initialAge, the constructor should set to and print Age is not valid, setting age to 0.. In addition,
 *   you must write the following instance methods:
 *   
 *   yearPasses() should increase the instance variable by 1.
 *   amIOld() should perform the following conditional actions:
 *   	If age < 13, print You are young..
 *   	If >= 13 and < 18, print You are a teenager..
 *   	Otherwise, print You are old..
 *   
 *Input Format:
 *Input is handled for you by the stub code in the editor.
 *The first line contains an integer, (the number of test cases), and the subsequent lines each contain an integer denoting the
 * of a Person instance.
 * */

public class DaysOfCode4 {

	private int age;

	public DaysOfCode4(int initialAge) {

		if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0");
			this.age = 0;
		} else
			this.age = initialAge;
	}

	public void amIOld() {

		if (this.age < 13)
			System.out.println("You are young.");
		else if (this.age >= 13 && this.age < 18)
			System.out.println("You are a teenager");
		else
			System.out.println("You are old.");
	}

	public void yearPasses() {

		this.age++;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for (int i = 0; i < T; i++) {
			int age = scan.nextInt();
			DaysOfCode4 p = new DaysOfCode4(age);
			p.amIOld();

			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}

			p.amIOld();
			System.out.println();
		}

		scan.close();
	}
}
