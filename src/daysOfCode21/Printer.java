package daysOfCode21;

public class Printer {

	/**
	 * Method Name: printArray Print each element of the generic array on a new
	 * line. Do not return anything.
	 * 
	 * @param A
	 *            generic array
	 * @return
	 **/

	public static <E> void printArray(E[] array) {
		for (E i : array)
			System.out.println(i);

	}

}
