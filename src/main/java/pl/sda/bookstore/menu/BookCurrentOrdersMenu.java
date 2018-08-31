package pl.sda.bookstore.menu;

import pl.sda.bookstore.OrderManager;
import pl.sda.bookstore.menu.customer.Customer;
import pl.sda.bookstore.menu.customer.customerManager;

import java.util.Scanner;

public class BookCurrentOrdersMenu {
    private final Scanner sc;
    private final OrderManager orderManager;

    public BookCurrentOrdersMenu(Scanner sc, OrderManager orderManager) {
        this.sc = sc;
        this.orderManager = orderManager;
    }

    public void showMenu() {
        while(true) {
            System.out.println("1. Pobierz zamówienie do realizacji - szczęśliwe wysyłanie! - jeśli się nie powiedzie tj. na magazynie nie ma ksiżek powinno nas przenieść do innego menu");
            System.out.println("2. Usuń zamówienie z listy zamówień, Podaj dane zamawiajcego");
            System.out.println("3. Powrót");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    orderManager.getNextOrder();
                    break;
                case 2:
                    Customer customer = customerManager.createCustomer(sc);
                    orderManager.removeOrder(customer);
                    break;
                case 3:
                    return;
            }
        }
    }
}
