package eu.chrost.java8.people;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Getter
@EqualsAndHashCode
@ToString
public class Person {
    private final String name;
    private final Sex sex;
    private final int weight;
    private final int height;
    private final LocalDate dateOfBirth;
    private final Set<Phone> phoneNumbers;

    public Person(String name, Sex sex, int weight, int height, LocalDate dateOfBirth, Phone... phoneNumbers) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumbers = new HashSet<>(Arrays.asList(phoneNumbers));
    }

}
