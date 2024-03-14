package tut07.library;

import java.util.*;

public class Book {
    private String isbn, title, subject;
    private List<String> authors = new ArrayList<>();
    private List<String> publisher = new ArrayList<>();
    private String language;
    private int numberOfPages = 0;
    private Format format = Format.Newspaper;

    public Book() {
    }

    public Book(String isbn, String title, String sub, String auth, String pub, String lang, int num) {
        if (!validISBN(isbn)) {
            throw new IllegalArgumentException("ISBN has 13 numbers!");
        }

        if (!validLetter(title) || !validLetter(sub) || !validLetter(lang)) {
            throw new IllegalArgumentException("Must be letter!");
        }

        if (!validName(auth) || !validName(pub)) {
            throw new IllegalArgumentException("Author name or publisher name invalid!");
        }

        if (!validNum(num)) {
            throw new IllegalArgumentException("Invalid number of pages!");
        }

        this.isbn = isbn;
        this.title = title;
        this.subject = sub;
        this.language = lang;
        this.numberOfPages = num;
        this.authors.add(auth);
        this.publisher.add(pub);
    }

    // getter

    public String getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public String getLang() {
        return language;
    }

    public int getNum() {
        return numberOfPages;
    }

    public Format getFormat() {
        return format;
    }

    // setter

    public void setISBN(String isbn) {
        if (!validISBN(isbn)) {
            throw new IllegalArgumentException("ISBN has 13 numbers!");
        }

        this.isbn = isbn;
    }

    public void setTitle(String t) {
        if (!validLetter(title)) {
            throw new IllegalArgumentException("Must be letter!");
        }

        this.title = t;
    }

    public void setSubject(String sub) {
        if (!validLetter(sub)) {
            throw new IllegalArgumentException("Must be letter!");
        }

        this.subject = sub;
    }

    public void setAuthor(String a) {
        if (!validName(a)) {
            throw new IllegalArgumentException("Invalid author name!");
        }

        this.authors.add(a);
    }

    public void setPublisher(String pub) {
        if (validName(pub)) {
            throw new IllegalArgumentException("Invalid publisher name!");
        }

        this.publisher.add(pub);
    }

    public void setLang(String lang) {
        if (!validLetter(lang)) {
            throw new IllegalArgumentException("Must be letter!");
        }
    }

    public void setNum(int n) {
        if (!validNum(n)) {
            throw new IllegalArgumentException("Invalid number of pages!");
        }

        this.numberOfPages = n;
    }

    public void setFormat(Format f) {
        if (!validFormat(f)) {
            throw new IllegalArgumentException("Invalid format!");
        }

        this.format = f;
    }

    // display

    public void displayBook() {
        System.out.println("\tBook Information\t");
        System.out.println("ISBN: " + getISBN());
        System.out.println("Title: " + getTitle());
        System.out.println("Authors: " + getAuthors());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Language: " + getLang());
        System.out.println("Number of pages: " + getNum());
        System.out.println("Format: " + getFormat());
        System.out.println();
    }

    public void addAuthor(String author) {
        if (!validName(author)) {
            throw new IllegalArgumentException("Invalid author name!");
        }

        this.authors.add(author);
    }

    /**
     * @Validation
     * 
     */

    private boolean validISBN(String isdn) {
        return isdn.matches("^[0-9]{13}$");
    }

    private boolean validName(String n) {
        return n.matches("^[a-zA-Z0-9-._\\s]+$");
    }

    private boolean validLetter(String n) {
        return n.matches("^[a-zA-Z\\s]+$");
    }

    private boolean validNum(int n) {
        return n > 0;
    }

    private boolean validFormat(Format f) {
        for (Format i : Format.values()) {
            if (i == f)
                return true;
        }

        return false;
    }
    // .................
}
