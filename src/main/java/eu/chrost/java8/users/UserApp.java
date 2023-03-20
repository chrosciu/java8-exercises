package eu.chrost.java8.users;

import java.util.Optional;
import java.util.function.Predicate;

public class UserApp {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Optional<User> maybeUser = userService.getById(1);
        Optional<String> maybeName = maybeUser.map(User::getName);
        maybeName.ifPresent(System.out::println);



        Optional<User> filteredUser = maybeUser.filter(user -> isNotKowalski.test(user));
        filteredUser.ifPresent(user -> System.out.println("To nie jest Kowalski"));

        Optional<Address> maybeAddress = maybeUser.flatMap(User::getAddress);
        maybeAddress.ifPresent(address -> System.out.println(address.getStreet()));
        maybeUser = userService.getById(2);



        maybeUser.ifPresent(user -> {
            System.out.println(user.getName());
        });

        User safeUser = maybeUser.orElse(new User("Chrost"));
        System.out.println(safeUser.getName());

        safeUser = maybeUser.orElseGet(() -> new User("Chrost"));
        System.out.println(safeUser.getName());

        safeUser = maybeUser.orElseThrow(() -> new RuntimeException("Nie ma tego czlowieka"));
        System.out.println(safeUser.getName());
    }

    private static Predicate<User> isNotKowalski = user -> !"Kowalski".equals(user.getName());
}
