package eu.chrost.java8.users;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Getter
@RequiredArgsConstructor
public class User {
    private final String name;

    public Optional<Address> getAddress() {
        if ("Nowak".equals(name)) {
            return Optional.of(new Address("Kwiatowa"));
        } else {
            return Optional.empty();
        }
    }
}
