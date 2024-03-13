package tut07.library.design;

import java.util.*;

public class Catalog implements Search {
    private Date creationDate;
    private int totalBooks = 0;
    private Map<String, List<Book>> booksByTitle;
    private Map<String, List<Book>> booksByAuthor;
    private Map<String, List<Book>> booksBySubject;
    private Map<String, List<Book>> booksByFormat;

    public Catalog() {
    }

    public Catalog(Date crDate) {
        this.creationDate = crDate;
        this.booksByTitle = new HashMap<>();
        this.booksByAuthor = new HashMap<>();
        this.booksBySubject = new HashMap<>();
        this.booksByFormat = new HashMap<>();
        // ................
    }

    @Override
    public List<Book> searchByTitle(String t) {
        return booksByTitle.getOrDefault(t, new ArrayList<>());
    }

    @Override
    public List<Book> searchByAuthor(String a) {
        return booksByAuthor.getOrDefault(a, new ArrayList<>());
    }

    @Override
    public List<Book> searchBySubject(String s) {
        return booksBySubject.getOrDefault(s, new ArrayList<>());
    }

    @Override
    public List<Book> searchByFormat(Format f) {
        return booksByFormat.getOrDefault(f, new ArrayList<>());
    }

    // mai hoc dsa lam tiep nhe =))
}
