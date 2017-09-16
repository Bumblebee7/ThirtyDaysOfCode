package daysOfCode28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numOftestCases = scan.nextInt();
		List<String> names = new ArrayList<>();

		// RegEx
		String regExString = "@gmail.com";
		Pattern pattern = Pattern.compile(regExString);

		for (int a0 = 0; a0 < numOftestCases; a0++) {
			String firstName = scan.next();
			String emailID = scan.next();

			// RegEx
			Matcher matcher = pattern.matcher(emailID);
			if (matcher.find()) {
				names.add(firstName);
			}
		}
		Collections.sort(names);
		for (String name : names)
			System.out.println(name);
		scan.close();
	}
}
