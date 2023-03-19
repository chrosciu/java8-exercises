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
import static org.assertj.core.data.Offset.offset;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class Part02FunctionalInterfacesTest {

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

    @Test
    public void shouldDecideIfNegative() {
        final Predicate<Double> isNegative = null;

        assertThat(isNegative.test(3.0)).isFalse();
        assertThat(isNegative.test(0.0)).isFalse();
        assertThat(isNegative.test(-1.1)).isTrue();
    }

    @Test
    public void shouldCallOtherClassInConsumer() {
        final Date dateMock = mock(Date.class);

        final Consumer<Long> consumer = null;

        consumer.accept(1000L);
        consumer.accept(2000L);

        final InOrder order = inOrder(dateMock);
        order.verify(dateMock).setTime(1000L);
        order.verify(dateMock).setTime(2000L);
    }

    @Test
    public void shouldCallOtherClassInPrimitiveConsumer() {
        final Date dateMock = mock(Date.class);

        final LongConsumer consumer = null;

        consumer.accept(1000L);
        consumer.accept(2000L);

        final InOrder order = inOrder(dateMock);
        order.verify(dateMock).setTime(1000L);
        order.verify(dateMock).setTime(2000L);
    }

}
