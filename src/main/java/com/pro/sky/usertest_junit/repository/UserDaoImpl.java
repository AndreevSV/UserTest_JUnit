package com.pro.sky.usertest_junit.repository;

import com.pro.sky.usertest_junit.model.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@Repository
public class UserDaoImpl implements UserDao {

    private List<User> userList = new ArrayList<>();

    @Override
    public void addToUserList() {
        userList.add(new User("user1", "user1@gmail.com", "User1"));
        userList.add(new User("user2", "user2@gmail.com", "User2"));
        userList.add(new User("user3", "user3@gmail.com", "User3"));
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }

    @Override
    public User getUserByName(String name) {
            return userList.stream()
                    .filter(n -> n.getName().equals(name))
                    .findFirst()
                    .orElse(null);
    }

}
