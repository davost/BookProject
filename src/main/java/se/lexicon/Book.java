package se.lexicon;

public class Book {
    private String bookName;
    private Author author;


    public Book(String bookName, Author author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
        author.addNewBooksToBookArray(this);
    }
    public void printBookInfo() {
        System.out.println(bookName + author.getAuthorName());
    }
}
