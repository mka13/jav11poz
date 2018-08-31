package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;

import java.util.Arrays;
import java.util.List;

public class BookManager {
     public static List<Book>  createBooks(){
       Book Book1= new Book ("Pan Tadeusz","Adam Mickiewicz",20.50,"klasyka",5.0);
         Book Book2= new Book ("Dziady","Adam Mickiewicz",15.50,"klasyka",7.0);
         Book Book3= new Book ("Latarnik","Adam Mickiewicz",10.50,"klasyka",6.0);
         Book Book4= new Book ("Gra o tron","Adam Mickiewicz",8.50,"klasyka",3.0);
         Book Book5= new Book ("xyz","fasijas",8.50,"klasyka",9.0);

         //TODO sprawdzic jaki argument przyjmuje AS LIST !!
         List<Book> books = Arrays.asList(Book1, Book2, Book3, Book4, Book5);
         return  books;

     }
}
