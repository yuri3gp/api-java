package com.example.todolist.application.services;

import com.example.todolist.domain.model.entities.User;
import com.example.todolist.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User updateUser(Long userId, User updatedUser) {
        User existingUser = userRepository.findById(userId).orElse(null);
        if (existingUser != null) {
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setPassword(updatedUser.getPassword());
            return userRepository.save(existingUser);
        }
        return null;
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public Page<User> getAllUsers(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return userRepository.findAll(pageRequest);
    }

    public Page<User> getAllUsers(PageRequest pageRequest) {
        return null;
    }
}
