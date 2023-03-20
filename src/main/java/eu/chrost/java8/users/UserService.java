package eu.chrost.java8.users;

import java.util.Optional;

public class UserService {
    public Optional<User> getById(int id) {
        if (1 == id) {
            return Optional.of(new User("Kowalski"));
        } else {
            return Optional.empty();
        }
    }
}
