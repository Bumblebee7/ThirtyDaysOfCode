package daysOfCode17;

public class Calculator {

	public int power(int n, int p) {

		if (n < 0 || p < 0)
			throw new IllegalArgumentException("n and p should be non-negative");
		else
			return (int) Math.pow(n, p);
	}
}
