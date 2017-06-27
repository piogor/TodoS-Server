package com.lapek.todo.entities;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Todo {

    @Id
    private String id;

    private String description;

    private String title;

    public Todo() {
    }

    public Todo(String description, String title) {
        this.description = description;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
