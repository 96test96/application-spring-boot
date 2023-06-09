package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;


public interface UserDao {
    public List<User> getAllUsers();

    public void addUser(User user);

    public User getUserById(int id);
    public void updateUser(User user);

    public void deleteUser(int id);
}
