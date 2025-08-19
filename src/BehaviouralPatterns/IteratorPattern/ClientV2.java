package BehaviouralPatterns.IteratorPattern;

import java.util.Iterator;

public class ClientV2 {
    public static void main(String[] args) {
        BookCollectionV2 bookCollectionV2 = new BookCollectionV2();
        bookCollectionV2.addBook(new Book("C++"));
        bookCollectionV2.addBook(new Book("Java"));
        bookCollectionV2.addBook(new Book("Python"));
        bookCollectionV2.addBook(new Book("Javascript"));
        bookCollectionV2.addBook(new Book("Kotlin"));
        bookCollectionV2.addBook(new Book("Swift"));

        Iterator<Book> iterator = bookCollectionV2.createIterator();
        while (iterator.hasNext()) {
            Book book =  iterator.next();
            System.out.println(book);
        }
        
    }
}
