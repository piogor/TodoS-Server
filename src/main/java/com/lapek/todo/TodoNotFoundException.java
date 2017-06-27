package com.lapek.todo;

public class TodoNotFoundException extends RuntimeException {

    public TodoNotFoundException() {
        super();
    }

    public TodoNotFoundException(String id) {
        super(String.format("Todo with id: <%s> not found.", id));
    }
}