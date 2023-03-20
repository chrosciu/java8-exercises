package eu.chrost.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("a", "ab", "ba", "abc");

        Map<Integer, List<String>> itemsByLength = items.stream()
                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(itemsByLength);

        Map<Boolean, List<String>> itemsStartingWithA = items.stream()
                .collect(Collectors.partitioningBy(s -> s.startsWith("a")));

        System.out.println(itemsStartingWithA);
    }
}
