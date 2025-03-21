package com.davidev.todoList.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.davidev.todoList.service.TodoService;
import com.davidev.todoList.entity.Todo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.davidev.todoList.service.TodoService;

@RestController
@RequestMapping("Todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
    }

    @GetMapping
    List<Todo> list(){
        return todoService.list();

    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable Long id){
        return todoService.delete(id);
    }
}
