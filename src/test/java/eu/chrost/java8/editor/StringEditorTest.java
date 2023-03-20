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
}
