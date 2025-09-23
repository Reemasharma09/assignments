import java.util.ArrayList;
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
class Library {
    String name;
    ArrayList<Book> books;
    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }
    void addBook(Book book) {
        books.add(book);
    }
    void displayLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.displayBookInfo();
        }
        System.out.println("------------------------");
    }
}
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Clean Code", "Robert Martin");
        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("Community Library");
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b1);
        lib1.displayLibraryBooks();
        lib2.displayLibraryBooks();
    }
}