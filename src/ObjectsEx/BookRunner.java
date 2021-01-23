package ObjectsEx;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(101, "krishna", "kanth");
		book.addReview(new Review(10, "Greak book", 5));
		book.addReview(new Review(15, "balk book", 4));
		System.out.println(book);

	}

}
