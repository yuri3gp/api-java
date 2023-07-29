package com.example.domain.data.repositories;

import com.example.domain.entities.User;

public interface IUserRepository {
    User[] retriveUser();

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(int userId);
}