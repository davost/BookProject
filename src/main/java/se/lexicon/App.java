package se.lexicon;

/**
 * Hello world!
 *
 */
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class App {
        public static void main(String[] args) {
                Author author1 = new Author("mehr ");
                Book bookTest = new Book("new test", author1);
                author1.addNewBooksToBookArray(bookTest);
                author1.printBooksByAuthor();
                bookTest.printBookInfo();
                bookTest.getAuthor().printBooksByAuthor();
                System.out.println("Hello");
        }
}