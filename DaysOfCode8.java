package thirtyDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Task:
 * Given N names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
 * You will then be given an unknown number of names to query your phone book for. For each name queried, print the 
 * associated entry from your phone book  on a new line in the form name=phoneNumber; if an entry for name is not found,
 * print Not found instead.
 * 
 * Note: Your phone book should be a Dictionary/Map/HashMap data structure.
 * 
 * Input Format:
 * The first line contains an integer, N , denoting the number of entries in the phone book.
 * Each of the N subsequent lines describes an entry in the form of 2 space-separated values on a single line. The first
 * value is a friend's name, and the second value is an 8-digit phone number.
 * 
 * After the N lines of phone book entries, there are an unknown number of lines of queries. Each line (query) contains
 * a name to look up, and you must continue reading lines until there is no more input.
 * 
 * Note: Names consist of lowercase English alphabetic letters and are first names only.
 */

public class DaysOfCode8 {

	public static void main(String[] argh) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();

		// Input
		for (int i = 0; i < n; i++) {
			String name = in.next();
			// better use Integer (object) than int because map originally works
			// with objects not primitive datatypes
			Integer phone = new Integer(in.nextInt());
			phoneBook.put(name, phone);
		}

		// Output
		while (in.hasNext()) {
			String s = in.next();
			if (phoneBook.get(s) == null)
				System.out.println("Not found");
			else
				// toString useally is not necessary because the Compiler will
				// do it on his own, but usually it is what happens here
				System.out.println(s + "=" + phoneBook.get(s).toString());

		}
		in.close();
	}
}
