package tut07.library;

import java.util.*;

public interface Search {
    void searchByTitle(String title);
    void searchByAuthor(List<String> author);
    void searchBySubject(String subject);
    void searchByFormat(Format format);
}