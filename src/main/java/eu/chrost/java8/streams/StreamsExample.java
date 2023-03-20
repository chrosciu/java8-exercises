package eu.chrost.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("a", "b", "c", "de");
        List<String> toUpper = toUpperSingle(items);
        System.out.println(toUpper);
        System.out.println(join(toUpper));

        List<String> toUpper2 = toUpperWithStream(items);
        System.out.println(toUpper2);

        System.out.println(joinWithStream(toUpper2));
        System.out.println(allSingleChars(toUpper2));

        System.out.println(find(items, "a"));
        System.out.println(find(items, "x"));

        int[] array = new int[] {2, 3, 5};
        System.out.println(findMax(array));

        List<String> unsorted = Arrays.asList("b", "c", "a");
        System.out.println(sort(unsorted));
    }

    public static List<String> toUpperSingle(List<String> items) {
        List<String> result = new ArrayList<>();
        for (String item : items) {
            if (item.length() == 1) {
                result.add(item.toUpperCase());
            }
        }
        return result;
    }

    public static List<String> toUpperWithStream(List<String> items) {
        return items.stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() == 1)
                .collect(Collectors.toList());
    }

    public static String join(List<String> items) {
        StringBuilder builder = new StringBuilder();
        for (String item: items) {
            builder.append(item);
        }
        return builder.toString();
    }

    public static String joinWithStream(List<String> items) {
        return items.stream().collect(Collectors.joining());
    }

    public static boolean allSingleChars(List<String> items) {
        return items.stream().allMatch(s -> s.length() == 1);
    }

    public static Optional<String> find(List<String> items, String pattern) {
        return items.stream()
                .filter(s -> s.equals(pattern))
                .findFirst();
    }

    public static int findMax(int[] array) {
        return IntStream.of(array)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public static List<String> sort(List<String> items) {
        return items.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
