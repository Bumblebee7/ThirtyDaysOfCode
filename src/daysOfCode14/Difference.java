package daysOfCode14;

public class Difference {

	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {

		int diff;
		int maxDiff = 0;
		for (int k = 0; k < this.elements.length; k++) {
			for (int i = 1; i < this.elements.length; i++) {
				diff = Math.abs((elements[k] - elements[i]));
				if (diff > maxDiff)
					maxDiff = diff;
			}
		}

		maximumDifference = maxDiff;
	}
}
