package daysOfCode12;

class Student extends Person {

	private int[] testScores;

	// constructor
	Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;
		// TODO Auto-generated constructor stub
	}

	// calculates the average value of the scores
	public char calculate() {

		int average;
		int total = 0;
		char grade;

		for (int i = 0; i < testScores.length; i++) {
			total += testScores[i];
		}
		average = total / testScores.length;

		if (average <= 100 && average >= 90)
			grade = 'O';
		else if (average <= 100 && average >= 90)
			grade = 'E';
		else if (average <= 100 && average >= 90)
			grade = 'A';
		else if (average <= 100 && average >= 90)
			grade = 'P';
		else if (average <= 100 && average >= 90)
			grade = 'D';
		else
			grade = 'T';

		return grade;
	}
}