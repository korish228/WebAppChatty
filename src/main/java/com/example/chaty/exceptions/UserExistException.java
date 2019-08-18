package com.example.chaty.exceptions;

import com.example.chaty.model.User;

public class UserExistException extends Exception {


    public UserExistException(User user) {
        super("User with " + user.getEmail() + " is exist please choose other email");
    }
}
