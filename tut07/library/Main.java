package tut07.library;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person test = new Person("Minh", "123456789", "dovanminh253@gmail.com");

        Book book1 = new Book("1234567890123", "Java Programming", "Programming", "John", "ABC Publications",
                "English", 300);
        book1.setFormat(Format.Paperback);

        book1.displayBook();

        book1.addAuthor("Jane Smith");

        book1.displayBook();

        Person author1 = new Person("Jane Smith", "987654321", "jane.smith@example.com");
        Person author2 = new Person("Alan Johnson", "456789123", "alan.johnson@example.com");


        Book book2 = new Book("9876543210987", "Data Structures and Algorithms", "Computer Science", "Jane",
                "Publications", "English", 400);
        book2.setFormat(Format.Hardcover);
        book2.addAuthor("Alan");

        Catalog catalog = new Catalog(LocalDate.now());

        catalog.addBook(book1);
        catalog.addBook(book2);

        System.out.println("Search results for title 'Java Programming':");
        catalog.searchByTitle("Java Programming");

        System.out.println("\nSearch results for author 'John Doe':");
        catalog.searchByAuthor(Arrays.asList("John Doe"));

        System.out.println("\nSearch results for format 'Paperback':");
        catalog.searchByFormat(Format.Paperback);
    }
}
