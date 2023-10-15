package com.example.tobyspring.user.dao;

import java.util.List;

import com.example.tobyspring.user.domain.User;

public interface UserDao {
    void add(User user);
    User get(String id);
    List<User> getAll();
    void deleteAll();
    int getCount();
}
