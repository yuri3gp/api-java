package com.example.todolist.domain.repositories;

import com.example.todolist.domain.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}