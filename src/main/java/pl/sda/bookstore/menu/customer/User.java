package pl.sda.bookstore.menu.customer;

import java.util.Objects;

public class User extends Customer {
    private final String name;
    private final String surname;


    public User(String address, String name, String surname) {
        super(address);
        this.name=name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }


}
