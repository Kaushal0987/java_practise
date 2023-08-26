package Author;

public class Book {
	private String title;
	private Author author;
	private double price;
	
	public Book(String title, Author author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setauthor(Author author) {
		this.author = author;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Author getauthor() {
		return author;
	}
	
	public double getprice() {
		return price;
	}
	
	public String toString() {
		return "Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
	}
	
}
