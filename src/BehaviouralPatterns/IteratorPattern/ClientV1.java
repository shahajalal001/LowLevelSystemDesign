package BehaviouralPatterns.IteratorPattern;

public class ClientV1 {
    public static void main(String[] args) {
        BookCollectionV1 bookCollectionV1 = new BookCollectionV1();
        bookCollectionV1.addBook(new Book("C++"));
        bookCollectionV1.addBook(new Book("Java"));
        bookCollectionV1.addBook(new Book("Python"));
        bookCollectionV1.addBook(new Book("Javascript"));
        bookCollectionV1.addBook(new Book("Kotlin"));
        bookCollectionV1.addBook(new Book("Swift"));

        for(int i=0; i<bookCollectionV1.getBooks().size(); i++){
            System.out.println(bookCollectionV1.getBooks().get(i));
        }

    }
}
