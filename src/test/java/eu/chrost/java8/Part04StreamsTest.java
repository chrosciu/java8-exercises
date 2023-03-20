package eu.chrost.java8;

import eu.chrost.java8.people.Person;
import eu.chrost.java8.people.Phone;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static eu.chrost.java8.people.Sex.FEMALE;
import static eu.chrost.java8.people.Sex.MALE;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * - What is Stream<T>
 * - More complex operations on Stream, (map, filter, forEach, sorted)
 * - Only toList() Collector
 */
public class Part04StreamsTest {

    private static final List<Person> PEOPLE = Arrays.asList(
            new Person("Jane", FEMALE, 62, 169, LocalDate.of(1986, Month.DECEMBER, 21), new Phone(10, 555100200)),
            new Person("Bob", MALE, 71, 183, LocalDate.of(1982, Month.FEBRUARY, 5), new Phone(10, 555100201)),
            new Person("Steve", MALE, 85, 191, LocalDate.of(1980, Month.MAY, 4), new Phone(11, 555100200), new Phone(11, 555100201), new Phone(11, 555100202)),
            new Person("Alice", FEMALE, 54, 178, LocalDate.of(1984, Month.AUGUST, 17), new Phone(12, 555100202)),
            new Person("Eve", FEMALE, 61, 176, LocalDate.of(1987, Month.FEBRUARY, 9), new Phone(10, 555100200))
    );

    @Test
    public void doesAnyFemaleExist() {
        final boolean anyFemale = PEOPLE.stream()
                .anyMatch(p -> p.getSex() == FEMALE);
//        final boolean anyFemale = PEOPLE.stream()
//                .map(Person::getSex)
//                .anyMatch(FEMALE::equals);
//        final boolean anyFemale = PEOPLE.stream()
//                .filter(p -> p.getSex() == FEMALE)
//                .count() > 0;

        assertThat(anyFemale).isTrue();
    }

    @Test
    public void shouldReturnNamesSorted() {
        final List<String> names = emptyList();

        assertThat(names).containsExactly("Alice", "Bob", "Eve", "Jane", "Steve");
    }

    /**
     * Are all people below 80 kg?
     */
    @Test
    public void areAllPeopleSlim() {
        final boolean allSlim = true;

        assertThat(allSlim).isFalse();
    }

    /**
     * Are all people above 80 kg?
     */
    @Test
    public void areAllPeopleNotSlim() {
        final boolean allNotSlim = true;

        assertThat(allNotSlim).isFalse();
    }

    @Test
    public void findTallestPerson() {
        final Optional<Person> max = Optional.empty();

        assertThat(max).hasValue(PEOPLE.get(2));
    }

    @Test
    public void countMales() {
        final long malesCount = 0;

        assertThat(malesCount).isEqualTo(2);
    }

    /**
     * Hint: use limit(2)
     */
    @Test
    public void twoOldestPeople() {
        final List<Person> oldest = emptyList();

        assertThat(oldest).containsExactly(PEOPLE.get(2), PEOPLE.get(1));
    }

    /**
     * Hint: PEOPLE.stream()...mapToInt()...sum()
     */
    @Test
    public void totalWeight() {
        final int totalWeight = 0;

        assertThat(totalWeight).isEqualTo(333);
    }

    /**
     * Hint: PEOPLE.stream()...flatMap()...distinct()
     * <p>
     * Challenging
     */
    @Test
    public void findUniqueCountryCodes() {
        final List<Integer> distinctCountryCodes = emptyList();

        assertThat(distinctCountryCodes).containsExactly(10, 11, 12);
    }



}
