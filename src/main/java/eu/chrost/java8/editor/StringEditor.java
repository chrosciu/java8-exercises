package eu.chrost.java8.editor;

import java.util.function.Function;

public class StringEditor {
    static StringEditor stringEditor = new StringEditor();

    public enum OperationType {
        TO_LOWER(String::toLowerCase),
        TO_UPPER(String::toUpperCase),
        PREPEND_HELLO(StringEditor::prependHello),
        APPEND_HELLO(stringEditor::appendHello),
        COPY(String::new);
        private final Function<String, String> operation;

        OperationType(Function<String, String> operation) {
            this.operation = operation;
        }

        public Function<String, String> getOperation() {
            return this.operation;
        }


    }

    public interface Operation {
        String transform(String input);
    }

    public String transform(String input, OperationType operationType) {
        Function<String, String> operation = operationType.getOperation();
        return operation.apply(input);
    }

    public static String prependHello(String input) {
        return "Hello " + input;
    }

    public String appendHello(String input) {
        return input + " Hello";
    }

}
