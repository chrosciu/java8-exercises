package eu.chrost.java8;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class Part02aMethodReferencesTest {

    @Test
    public void shouldPrependHello() {
        final Function<Integer, String> fun = null;

        assertThat(fun.apply(42)).isEqualTo("Hello 42");
    }


    @Test
    public void shouldProduceAnswer() {
        final Supplier<Integer> answerFun = null;

        assertThat(answerFun.get()).isEqualTo(42);
    }

    private String prependHello(String input) {
        return "Hello " + input;
    }

    private static Integer get42() {
        return 42;
    }





}
