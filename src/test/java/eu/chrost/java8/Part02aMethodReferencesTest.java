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
        final Function<Integer, String> fun = this::prependHello;

        assertThat(fun.apply(42)).isEqualTo("Hello 42");
    }


    @Test
    public void shouldProduceAnswer() {
        final Supplier<Integer> answerFun = Part02aMethodReferencesTest::get42;

        assertThat(answerFun.get()).isEqualTo(42);
    }

    @Test
    public void shouldCheckIfIsEmpty() {
        final Predicate<String> isEmpty = null;

        assertThat(isEmpty.test("")).isTrue();
        assertThat(isEmpty.test(" ")).isFalse();
        assertThat(isEmpty.test("Marcin")).isFalse();
    }

    private String prependHello(Integer input) {
        return "Hello " + input;
    }

    private static Integer get42() {
        return 42;
    }





}
