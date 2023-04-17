package com.pro.sky.usertest_junit.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class User {

    @Size(max = 10)
    private String login;
    private String email;

    public User(String login, String email) {
        this.login = login;
        setEmail(email);
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else throw new IllegalArgumentException("email is not correct" + email);
    }
}
