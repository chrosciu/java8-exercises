package eu.chrost.java8.users;

import lombok.Getter;

@Getter
public class Address {
    private String street;

    public Address(String street) {
        this.street = street;
    }



    public void setStreet(String street) {
        this.street = street;
    }
}
