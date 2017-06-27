package com.lapek.todo.repositories;

import com.lapek.todo.entities.Todo;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends Repository<Todo, String> {
    void delete(Todo todo);

    List<Todo> findAll();

    Optional<Todo> findOne(String id);

    Todo save(Todo todo);
}
