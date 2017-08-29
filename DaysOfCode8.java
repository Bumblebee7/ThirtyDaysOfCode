package thirtyDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysOfCode8 {

	public static void main(String[] argh) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String name = in.next();
			Integer phone = in.nextInt();
			phoneBook.put(name, phone);
		}

		while (in.hasNext()) {
			String s = in.next();
			if (phoneBook.get(s) == null)
				System.out.println("Not found");
			else
				System.out.println(s + "=" + phoneBook.get(s));

		}
		in.close();
	}
}
