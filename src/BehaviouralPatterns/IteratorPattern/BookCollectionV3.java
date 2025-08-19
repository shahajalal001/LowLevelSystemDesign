package BehaviouralPatterns.IteratorPattern;

import java.util.*;

public class BookCollectionV3 {
    private Set<Book> books = new TreeSet<>();

    void addBook(Book book){
        books.add(book);
    }

    Iterator<Book> iterator(){
        return books.iterator();
    }
}
