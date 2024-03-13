package tut07.library.design;

import java.util.*;

public class Book {
    private String isbn;
    private String title;
    private String subject;
    private List<String> authors;
    private List<String> publisher;
    private String language;
    private int numberOfPages;

    public Book() {
    }

    public Book(String isbn, String title, String sub, List<String> auth, List<String> pub, String lang, int num) {
        if (!validISBN(isbn)) {
            throw new IllegalArgumentException("Invalid ISBN!");
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
        this.authors = auth;
        this.publisher = pub;
        this.language = lang;
        this.numberOfPages = num;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        if (!validISBN(isbn)) {
            throw new IllegalArgumentException("Invalid ISBN!");
        }

        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        if (!validLetter(title)) {
            throw new IllegalArgumentException("Must be letter!");
        }

        this.title = t;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String sub) {
        if (!validLetter(sub)) {
            throw new IllegalArgumentException("Must be letter!");
        }

        this.subject = sub;
    }

    public List<String> getAuthor() {
        return authors;
    }

    public void setAuthor(List<String> a) {
        if (!validName(a)) {
            throw new IllegalArgumentException("Invalid author name!");
        }

        this.authors = a;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<String> pub) {
        if (validName(pub)) {
            throw new IllegalArgumentException("Author name or publisher name invalid!");
        }

        this.publisher = pub;
    }

    public String getLang() {
        return language;
    }

    public void setLang(String lang) {
        if (!validLetter(lang)) {
            throw new IllegalArgumentException("Must be letter!");
        }
    }

    public int getNum() {
        return numberOfPages;
    }

    public void setNum(int n) {
        if (!validNum(n)) {
            throw new IllegalArgumentException("Invalid number of pages!");
        }

        this.numberOfPages = n;
    }

    public void display() {
        System.out.println("\tBook Information\t");
        System.out.println("ISBN: " + getISBN());
        System.out.println("Title: " + getTitle());
        System.out.println("Authors: " + getAuthor());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Language: " + getLang());
        System.out.println("Number of pages: " + getNum());
        System.out.println();
    }

    /**
     * @Validation
     * 
     */

    private boolean validISBN(String isdn) {
        return isdn.matches("\\d{3}-\\d{10|\\d{13}");
    }

    private boolean validName(List<String> n) {
        return !n.isEmpty() || n != null;
    }

    private boolean validLetter(String n) {
        return n.matches("^[a-zA-Z\\s]+$");
    }

    private boolean validNum(int n) {
        return n > 0;
    }
}
