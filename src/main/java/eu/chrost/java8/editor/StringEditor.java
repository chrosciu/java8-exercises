package eu.chrost.java8.editor;

import java.util.function.Function;

public class StringEditor {
    public enum OperationType {
        TO_LOWER(input -> input.toLowerCase()),
        TO_UPPER(input -> input.toUpperCase());
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

}
