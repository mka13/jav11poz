package pl.sda.bookstore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookStorage {

    private final Map<Book, Integer> storage;

    public BookStorage(Map<Book, Integer> storage) {
        this.storage = storage;
    }

    public void addNewBookToStorage(Book book){
        storage.put(book, 0);
    }

    public void updateBookCount(Book book, int diff) {
        storage.put(book, storage.get(book) + diff);
    }

    public void addBooksToStorage(List<Book>books){
        for (Book x:books
             ) {
            addNewBookToStorage(x);

        }
    }

    public void showStorageState(){
        System.out.println();
        System.out.println("===========================================================================");
        System.out.println("Stan magazynowy: ");
        for (Map.Entry<Book,Integer> book : storage.entrySet()) {
            Book key = book.getKey();
            int value = book.getValue();
            System.out.println(key + ", " + value);
        }
    }

    public void sortByTitle() {

       // dodawanie danych z mapy po kluczu do listy
        Set<Book> bookSet = storage.keySet();
        bookSet.stream().sorted((book1,book2)->{
            return book1.getTitle().compareTo(book2.getTitle());
        }).forEach(System.out::println);


    }

public void sortByRating(){
    Set<Book>bookSet=storage.keySet();
        bookSet.stream().sorted((book1,book2)->{
            return (-1)* Double.valueOf(book1.getRating()).compareTo(Double.valueOf(book2.getRating()));
        }).forEach(System.out::println);

}


}
