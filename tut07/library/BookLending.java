package tut07.library;

import java.util.*;
import java.time.*;

public class BookLending {
    private LocalDate creationDate;
    private Account account;
    private List<BookItem> bookItems = new ArrayList<>();
    private LocalDate dueDate;
    private LocalDate returnDate;
    private BookItemStatus status;

    public BookLending() {
    }

    public BookLending(LocalDate creDate, Account acc, LocalDate dueDate, LocalDate returnDate,
            BookItemStatus s) {

        if (!validDate(creDate)) {
            throw new IllegalArgumentException("Invalid date format!");
        }

        if (!validSta(s)) {
            throw new IllegalArgumentException("Invalid status!");
        }

        this.creationDate = creDate;
        this.account = acc;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.status = s;
    }

    // getter

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Account getAccount() {
        return account;
    }

    public List<BookItem> getBookItems() {
        return bookItems;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public BookItemStatus getStatus() {
        return status;
    }

    // setter

    public void setCreationDate(LocalDate newDate) {
        if (!validDate(newDate)) {
            throw new IllegalArgumentException("Invalid date format!");
        }

        this.creationDate = newDate;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setStatus(BookItemStatus s) {
        if (!validSta(s)) {
            throw new IllegalArgumentException("Invalid status!");
        }

        this.status = s;
    }

    // display
    public void displayBookLending() {
        System.out.println("\tBook Lending");
        System.out.println("Creation Date: " + creationDate);
        System.out.println("Account: " + account);
        System.out.println("Book Items:");
        for (BookItem item : bookItems) {
            System.out.println("  - " + item);
        }
        System.out.println("Due Date: " + dueDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Status: " + status);
        System.out.println();
    }

    /**
     * @Validation
     */

    public boolean validDate(LocalDate date) {
        LocalDate current = LocalDate.now();
        return !date.isAfter(current) || date != null;
    }

    private boolean validSta(BookItemStatus s) {
        for (BookItemStatus i : BookItemStatus.values()) {
            if (i == s)
                return true;
        }

        return false;
    }
    // .....................
}
