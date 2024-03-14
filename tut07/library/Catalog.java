package tut07.library;

import java.time.*;
import java.util.*;

public class Catalog implements Search {
    private LocalDate creationDate;
    private int totalBooks = 0;
    private List<Book> books = new ArrayList<>();

    public Catalog() {
    }

    public Catalog(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    // getter

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public int getTotalBook() {
        return totalBooks;
    }

    // setter

    public void setCreationDate(LocalDate newDate) {
        if (!validDate(newDate)) {
            throw new IllegalArgumentException("Invalid date format!");
        }

        this.creationDate = newDate;
    }

    // Other methods
    public void addBook(Book book) {
        if (book == null) {
            System.err.println("Invalid book. Can not add!");
            return;
        }

        books.add(book);
        ++totalBooks;
    }

    public void removeBook(Book book) {
        if (book != null && books.contains(book)) {
            books.remove(book);
            --totalBooks;
            return;
        }

        System.out.println("Book not found!");
    }

    @Override
    public void searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found : " + book.getTitle());
                book.displayBook();
            }
        }
    }

    @Override
    public void searchByAuthor(List<String> authors) {
        for (Book book : books) {
            if (book.getAuthors().containsAll(authors)) {
                System.out.println("Book found : " + book.getTitle());
                book.displayBook();
            }
        }
    }

    @Override
    public void searchBySubject(String subject) {
        for (Book book : books) {
            if (book.getSubject().equalsIgnoreCase(subject)) {
                System.out.println("Book found : " + book.getTitle());
                book.displayBook();
            }
        }
    }

    @Override
    public void searchByFormat(Format format) {
        for (Book book : books) {
            if (book.getFormat() == format) {
                System.out.println("Book found: " + book.getTitle());
                book.displayBook();
            }
        }
    }

    /**
     * @Validation
     */

    public boolean validDate(LocalDate date) {
        LocalDate current = LocalDate.now();
        return !date.isAfter(current) || date != null;
    }
    // ........................
}
