package tut07.library;

import java.time.*;

public class BookItem {
    private String barcode;
    private double price;
    private Format format;
    private BookItemStatus status = BookItemStatus.Available;
    private LocalDate dateOfPurchase = LocalDate.now();
    private LocalDate publicationDate = LocalDate.now();
    private Book book;

    public BookItem() {
    }

    public BookItem(String bar, double pri, Format f, Book book) {
        if (!validBarcode(bar)) {
            throw new IllegalArgumentException("Barcode has at least 13 character.");
        }

        if (!validPri(pri)) {
            throw new IllegalArgumentException("Invalid price!");
        }

        if (!validFormat(f)) {
            throw new IllegalArgumentException("Invalid format!");
        }

        if (!validBook(book)) {
            throw new IllegalArgumentException("Book cannot be null");
        }

        this.barcode = bar;
        this.price = pri;
        this.format = f;
        this.book = book;
    }

    // getter

    public String getBarcode() {
        return barcode;
    }

    public double getPrice() {
        return price;
    }

    public Format getFormat() {
        return format;
    }

    public BookItemStatus getStatus() {
        return status;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public Book getBook() {
        return book;
    }

    // setter

    public void setBarcode(String bar) {
        if (!validBarcode(bar)) {
            throw new IllegalArgumentException("Barcode has at least 13 character.");
        }

        this.barcode = bar;
    }

    public void setPrice(double pri) {
        if (!validPri(pri)) {
            throw new IllegalArgumentException("Invalid price!");
        }

        this.price = pri;
    }

    public void setFormat(Format f) {
        if (!validFormat(f)) {
            throw new IllegalArgumentException("Invalid format!");
        }

        this.format = f;
    }

    public void setStatus(BookItemStatus s) {
        if (!validSta(s)) {
            throw new IllegalArgumentException("Invalid status!");
        }

        this.status = s;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        if (!validDate(dateOfPurchase)) {
            throw new IllegalArgumentException("Invalid date format!");
        }

        this.dateOfPurchase = dateOfPurchase;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        if (!validDate(publicationDate)) {
            throw new IllegalArgumentException("Invalid date format!");
        }

        this.publicationDate = publicationDate;
    }

    public void setBook(Book book) {
        if (!validBook(book)) {
            throw new IllegalArgumentException("Book cannot be null");
        }

        this.book = book;
    }
    public void displayBookItem() {
        System.out.println("\tBook Item infor");
        System.out.println("Barcode: " + getBarcode());
        System.out.println("Price: $" + getPrice());
        System.out.println("Format: " + getFormat());
        System.out.println("Status: " + getStatus());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("Publication Date: " + getPublicationDate());
        System.out.println();
    }
    
    // other methods

    public void updateBookItemStatus(BookItemStatus newStatus) {
        if (!validSta(newStatus)) {
            throw new IllegalArgumentException("Invalid status!");
        }

        this.status = newStatus;
    }

    /**
     * @Validation
     */

    private boolean validBarcode(String b) {
        return b.matches("\\d{13}");
    }

    private boolean validPri(double p) {
        return p > 0.0;
    }

    private boolean validFormat(Format f) {
        for (Format i : Format.values()) {
            if (i == f)
                return true;
        }

        return false;
    }

    private boolean validSta(BookItemStatus s) {
        for (BookItemStatus i : BookItemStatus.values()) {
            if (i == s)
                return true;
        }

        return false;
    }

    public boolean validDate(LocalDate date) {
        LocalDate current = LocalDate.now();
        return !date.isAfter(current) || date != null;
    }

    private boolean validBook(Book book) {
        return book != null;
    }

    // chua biet them gi nua
}
