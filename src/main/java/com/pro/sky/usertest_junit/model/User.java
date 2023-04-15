package com.pro.sky.usertest_junit.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class User {

    @Size(max = 10)
    private String login;
    @Pattern(regexp = "^[^@.]+@[^@.]+\\.[^@.]+$", message = "Incorrect e-mail, you should use '@' and '.'")
    private String email;

    public User(String loginCorrect, String emailCorrect) {
        this.login = loginCorrect;
        this.email = emailCorrect;
    }
}
