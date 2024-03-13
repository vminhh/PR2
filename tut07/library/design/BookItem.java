package tut07.library.design;

import java.util.Date;

public class BookItem {
    private String barcode;
    private double price;
    private Format format;
    private BookStatus status = BookStatus.Available;
    private Date dateOfPurchase;
    private Date publicationDate;
    private Book book;

    public BookItem() {
    }

    public BookItem(String b, double p, Format f, BookStatus s, Date date,
            Date publicationDate, Book book) {
        this.barcode = b;
        this.price = p;
        this.format = f;
        this.status = s;
        this.dateOfPurchase = date;
        this.publicationDate = publicationDate;
        this.book = book;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    // mai lam validation sau =))
}
