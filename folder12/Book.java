package com.bridgelabz.oops.inbuiltfunction;
public class Book {
    private static String libraryName = "City Central Library";
    private String title;
    private String author;
    private final String isbn;  // final ensures ISBN cannot be modified

    // Constructor (using this to resolve ambiguity)
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;  // Final variable must be initialized here
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayBookDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN   : " + isbn);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Book.displayLibraryName();

        // Create book objects
        Book book1 = new Book("Java Programming", "James Gosling", "ISBN-1001");
        Book book2 = new Book("Python Basics", "Guido van Rossum", "ISBN-1002");
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}