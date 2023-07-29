package com.example.infra.controller;

import com.example.applications.GetUserById;
import com.example.domain.entities.User;

public class UserController {
    public UserController(){}
    
    public User GetUserById(){
        return new User();
    }
}
