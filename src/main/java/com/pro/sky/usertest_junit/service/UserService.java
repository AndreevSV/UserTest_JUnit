package com.pro.sky.usertest_junit.service;

import com.pro.sky.usertest_junit.model.User;

import java.util.List;

public interface UserService {
    Boolean checkUserExist(String name);

    List<User> getAllUsers();
}
