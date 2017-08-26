package thirtyDaysOfCode;

import java.util.Scanner;

/*
 * Challenge 3/30 - 30 Days of Code Challenges by HackerRank.com
 * 
 * Calculate the total cost of a meal including tax and tip in %
 * 
 * Input Format:
 * There are lines of numeric input:
 * The first line has a double, mealCost (the cost of the meal before tax and tip).
 * The second line has an integer, tipPercent (the percentage of mealCost being added as tip).
 * The third line has an integer, taxPercent (the percentage of mealCost being added as tax).
 */

public class DaysOfCode2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		// calculate price
		double tax = mealCost * (taxPercent / 100.0);
		double tip = mealCost * (tipPercent / 100.0);
		double total = mealCost + tax + tip;

		// cast the result of the rounding operation to an int and save it as
		// totalCost
		int totalCost = (int) Math.round(total);

		System.out.printf("The total meal cost is %d dollars.", totalCost);
		// System.out.println("The total meal cost is " + totalCost + "
		// dollars."); //Alternative
	}
}
