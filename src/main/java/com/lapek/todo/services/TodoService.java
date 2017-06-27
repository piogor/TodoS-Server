package com.lapek.todo.services;

import com.lapek.todo.TodoNotFoundException;
import com.lapek.todo.dtos.TodoDTO;
import com.lapek.todo.entities.Todo;
import com.lapek.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
public final class TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public TodoDTO create(TodoDTO todoDTO) {
        Todo todo = new Todo(todoDTO.getTitle(), todoDTO.getDescription());
        todo = todoRepository.save(todo);
        return convertToDTO(todo);
    }

    public TodoDTO delete(String id) {
        Todo todo = findTodoById(id);
        todoRepository.delete(todo);
        return convertToDTO(todo);
    }

    public List<TodoDTO> findAll() {
        List<Todo> todoEntries = todoRepository.findAll();
        return convertToDTOs(todoEntries);
    }

    private List<TodoDTO> convertToDTOs(List<Todo> list) {
        return list.stream()
                .map(this::convertToDTO)
                .collect(toList());
    }

    public TodoDTO findById(String id) {
        Todo todo = findTodoById(id);
        return convertToDTO(todo);
    }

    public TodoDTO update(TodoDTO todoDTO) {
        Todo todo = findTodoById(todoDTO.getId());
        todo.setDescription(todoDTO.getDescription());
        todo.setTitle(todoDTO.getTitle());
        todo = todoRepository.save(todo);
        return convertToDTO(todo);
    }

    private Todo findTodoById(String id) {
        Optional<Todo> todo = todoRepository.findOne(id);
        return todo.orElseThrow(() -> new TodoNotFoundException(id));
    }

    private TodoDTO convertToDTO(Todo todo) {
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.setId(todo.getId());
        todoDTO.setTitle(todo.getTitle());
        todoDTO.setDescription(todo.getDescription());
        return todoDTO;
    }
}
