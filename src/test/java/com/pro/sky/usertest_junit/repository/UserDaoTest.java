package com.pro.sky.usertest_junit.repository;

import com.pro.sky.usertest_junit.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserDaoTest {

    public static final String USER_NAME_CORRECT = "User2";
    public static final String USER_NAME_INCORRECT = "User4";


    public static final User USER_CORRECT = new User("user2", "user2@gmail.com", "User2");
    public static final User USER_INCORRECT = null;


    @Test
    public void shouldReturnUserFromUserDao() {
        UserDao userDao = new UserDaoImpl();
        userDao.addToUserList();
        Assertions.assertEquals(USER_CORRECT, userDao.getUserByName(USER_NAME_CORRECT));
    }

    @Test
    public void shouldReturnNullFromUserDao() {
        UserDao userDao = new UserDaoImpl();
        userDao.addToUserList();
        Assertions.assertNull(userDao.getUserByName(USER_NAME_INCORRECT));
    }




}
