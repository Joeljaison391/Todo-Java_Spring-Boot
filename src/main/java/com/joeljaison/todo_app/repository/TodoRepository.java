package com.joeljaison.todo_app.repository;

import com.joeljaison.todo_app.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
