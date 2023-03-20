package eu.chrost.java8.editor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringEditorTest {
    @Test
    void shouldConvertToUpperCase() {
        String input = "Marcin";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.transform(input, StringEditor.OperationType.TO_UPPER);
        assertThat(result).isEqualTo("MARCIN");
    }

    @Test
    void shouldConvertToLowerCase() {
        String input = "Marcin";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.transform(input, StringEditor.OperationType.TO_LOWER);
        assertThat(result).isEqualTo("marcin");
    }

    @Test
    void shouldPrependHello() {
        String input = "Marcin";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.transform(input, StringEditor.OperationType.PREPEND_HELLO);
        assertThat(result).isEqualTo("Hello Marcin");
    }


    @Test
    void shouldAppendHello() {
        String input = "Marcin";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.transform(input, StringEditor.OperationType.APPEND_HELLO);
        assertThat(result).isEqualTo("Marcin Hello");
    }

    @Test
    void shouldCopy() {
        String input = "Marcin";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.transform(input, StringEditor.OperationType.COPY);
        assertThat(result).isEqualTo("Marcin");
    }
}
