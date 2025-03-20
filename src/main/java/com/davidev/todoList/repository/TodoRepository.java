package com.davidev.todoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.davidev.todoList.entity.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}