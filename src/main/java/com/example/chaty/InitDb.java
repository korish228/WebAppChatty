package com.example.chaty;

import com.example.chaty.exceptions.UserExistException;
import com.example.chaty.model.Role;
import com.example.chaty.model.User;
import com.example.chaty.service.RoleService;
import com.example.chaty.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDb implements CommandLineRunner {

    private UserService userService;
    private RoleService roleService;

    public InitDb(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @Override
    public void run(String... args) throws UserExistException {
        Role user_role = new Role("USER");

        this.roleService.createRole(user_role);

        User user = new User();
        user.setEmail("boybkorish@gmail.com");
        user.setPassword("123");

        this.userService.createUser(user);


    }
}

