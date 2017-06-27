package com.lapek.todo.dtos;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public final class TodoDTO {

    private String id;

    @Size(max = 300)
    private String description;

    @NotEmpty
    @Size(max = 100)
    private String title;

    public TodoDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
