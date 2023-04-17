package com.pro.sky.usertest_junit.service;

import com.pro.sky.usertest_junit.model.User;
import com.pro.sky.usertest_junit.repository.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {


    public static final String USER_NAME_CORRECT = "User2";
    public static final String USER_NAME_INCORRECT = "User4";


    public static final User USER_CORRECT = new User("user2", "user2@gmail.com", "User2");
    public static final User USER_INCORRECT = null;

    @Mock
    private UserDao userDaoMock;

    @InjectMocks
    private UserServiceImpl out;

    @Test
    public void shouldReturnExistUser() {
        userDaoMock.addToUserList();
        when(out.checkUserExist(USER_NAME_CORRECT)).thenReturn(true);
    }

    @Test
    public void shouldReturnNullUser() {
        userDaoMock.addToUserList();
        when(out.checkUserExist(USER_NAME_INCORRECT)).thenReturn(false);
    }


}