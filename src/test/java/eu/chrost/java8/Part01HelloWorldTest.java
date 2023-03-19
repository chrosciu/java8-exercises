package eu.chrost.java8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * - Smoke test, make sure it compiles, runs and passes.
 */
public class Part01HelloWorldTest {

    @Test
    public void hello() {
        final List<Integer> input = Arrays.asList(2, 3, 5, 7, 11);

        final List<Integer> output = input.stream()
                .map(i -> i * 2)
                .collect(toList());

        assertThat(output).containsExactly(4, 6, 10, 14, 22);
    }

}
