package tut07.library;

import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // test person
        Person person = new Person("Minh", "0985688467", "dovanminh253@gmail.com");
        System.out.println(person);

        // test book
        Book book1 = new Book("9780134685991", "Head First Java, 3rd Edition", "Object-Oriented Programming",
                "Kathy Sierra", "O'Reilly Media", "Englishh", 720);
        book1.addAuthor(" Bert Bates");
        book1.addAuthor("Trisha Gee");
        book1.displayBook();

        // test book item
        BookItem bookItem = new BookItem("9876512345123", 25.03, Format.Paperback, book1);
        bookItem.displayBookItem();

        // test booklending
        BookLending bookLending = new BookLending(LocalDate.now(), new Account("2201040110", "25032004", person),
                LocalDate.now(), LocalDate.now(), BookItemStatus.Available);
        bookLending.displayBookLending();

        // test catalog
        Catalog catalog = new Catalog(LocalDate.now());
        catalog.addBook(book1);
        catalog.searchByTitle("Java Programming");
        catalog.searchBySubject("Object-Oriented Programming");

        // testing more functionality
        // add more books to the catalog
        Book book2 = new Book("9780134685991", "Effective Java", "Programming", "Joshua Bloch",
                "Addison-Wesley Professional", "English", 412);
        book2.displayBook();
        catalog.addBook(book2);

        // search by author
        catalog.searchByAuthor(Arrays.asList("Trisha Gee"));
        catalog.searchBySubject("Programming");

        // semove a book
        catalog.removeBook(book1);

        // search by format
        catalog.searchByFormat(Format.Paperback);
    }
}
