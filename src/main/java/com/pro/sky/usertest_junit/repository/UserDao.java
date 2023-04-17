package com.pro.sky.usertest_junit.repository;

import com.pro.sky.usertest_junit.model.User;

import java.util.List;

public interface UserDao {


    void addToUserList();

    List<User> findAllUsers();

    User getUserByName(String name);
}
