package com.example.applications;

import com.example.domain.data.repositories.IUserRepository;
import com.example.domain.entities.User;

public class GetUserById {
    private IUserRepository userRepository;

    public GetUserById(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User[] execute(){
        User[] users = this.userRepository.retriveUser();
        return users;
    }
}
