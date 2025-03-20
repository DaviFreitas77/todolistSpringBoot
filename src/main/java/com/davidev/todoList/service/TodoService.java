package com.davidev.todoList.service;

import com.davidev.todoList.repository.TodoRepository;
import com.davidev.todoList.entity.Todo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    private TodoRepository todoRepository;

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();

    }

    public List<Todo> list() {

        return todoRepository.findAll();
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Todo todo) {
        todoRepository.deleteById(todo.getId());
        return list();
    }

    public List<Todo> delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
