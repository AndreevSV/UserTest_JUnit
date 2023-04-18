package com.pro.sky.usertest_junit.service;

import com.pro.sky.usertest_junit.model.User;
import com.pro.sky.usertest_junit.repository.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    @Override
    public Boolean checkUserExist(String name) {
        if (userDao.getUserByName(name) == null) {
            return false;
        }
        else return true;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAllUsers();
    }

}
