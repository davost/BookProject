package se.lexicon;

import java.util.Arrays;

public class Author {
    private String authorName;
    private Book[] books;

    public Author(String authorName, Book[] book) {
        this.authorName = authorName;
        this.books = book;
    }

    public Author(String authorName) {
        this.authorName = authorName;
        this.books = new  Book[0];
    }

    public void addNewBooksToBookArray(Book book) {
       // if (book == null) book = new Book[0];
        //Book[] newArray = Arrays.copyOf(book, book.length +1);
       // newArray[newArray.length - 1] = book;
       // book = newArray;
        if (books == null) books = new Book[0];
        Book[] newArray = Arrays.copyOf(books, books.length + 1);
        newArray[newArray.length - 1] = book;
        books = newArray;


    }

    public void printBooksByAuthor() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getBookName());
        }

    }

    public void printEveryBookByAuthor() {

    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBook(Book[] book) {
        this.books = book;
    }
}
