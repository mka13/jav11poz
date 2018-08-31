package pl.sda.bookstore;

import pl.sda.bookstore.Order;
import pl.sda.bookstore.menu.customer.Customer;
import pl.sda.bookstore.menu.customer.User;

import java.util.LinkedList;
import java.util.Queue;

public class OrderManager {

    Queue<Order> orderQueue = new LinkedList<>();


    public void add(Order order) {
        orderQueue.add(order);
    }

    public int orderCount() {
        return orderQueue.size();
    }

    public Order getNextOrder(){
        return orderQueue.remove();
    }

    public void removeOrder(Customer customer) {

        orderQueue.stream().forEach(x->{
        boolean isUser = customer instanceof User;
            if(x.getCustomer().equals(customer)){
                orderQueue.remove(x);
            }else{
                System.out.println("Nie znaleziono użytkownika");
            };
        });

       // !!!
        // orderQueue.removeIf(order -> order.getCustomer().equals(customer));


        //TODO Dobre żeby pokazać dziedziczenie !!!
    }
}
