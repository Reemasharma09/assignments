class Book {
    String title;
    String author;
    double price;
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : " + price);
    }
}
public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("The Java Handbook", "Patrick Naughton", 450.50);
        Book b2 = new Book("Clean Code", "Robert C. Martin", 650.75);
        System.out.println("Book 1 Details:");
        b1.displayDetails();
        System.out.println("\nBook 2 Details:");
        b2.displayDetails();
    }
}
