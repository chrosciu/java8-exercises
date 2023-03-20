package eu.chrost.java8.users;

import java.util.Optional;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public User(String name) {
        this.name = name;
    }

    public Optional<Address> getAddress() {
        if ("Nowak".equals(name)) {
            return Optional.of(new Address("Kwiatowa"));
        } else {
            return Optional.empty();
        }
    }
}
