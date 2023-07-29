package com.example.domain.entities;

import java.sql.Date;

import org.mindrot.jbcrypt.BCrypt;

public class User {
    public int id;
    public String name;
    public String email;
    private String password;
    public Date createdAt;

    public User(int id, String name, String email, String password, Date createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setPassword(String plainPassword) {
        String hashedPassword = BCrypt.hashpw(plainPassword, BCrypt.gensalt());
        this.password = hashedPassword;
    }

    public boolean checkPassword(String plainPassword) {
        return BCrypt.checkpw(plainPassword, password);
    }
}