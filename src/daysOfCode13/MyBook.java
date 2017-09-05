package daysOfCode13;

//Do not use the 'public' access modifier.

class MyBook extends Book {

	private int price;

	/**
	 * Class Constructor
	 * 
	 * @param title
	 *            The book's title.
	 * @param author
	 *            The book's author.
	 * @param price
	 *            The book's price.
	 **/
	public MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Method Name: display
	 * 
	 * Print the title, author, and price in the specified format.
	 **/
	@Override
	public void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + getPrice());
	}
}
