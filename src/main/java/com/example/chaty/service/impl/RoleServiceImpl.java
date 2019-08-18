package com.example.chaty.service.impl;

import com.example.chaty.exceptions.UserExistException;
import com.example.chaty.model.Role;
import com.example.chaty.model.User;
import com.example.chaty.repository.RoleRepository;
import com.example.chaty.repository.UserRepository;
import com.example.chaty.service.RoleService;
import com.example.chaty.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role createRole(Role role) {
//        if (this.roleRepository.findByName(role.getName()) == null){
//
//        }
//        throw new RuntimeException("This" + role.getName() + " exist");

        return this.roleRepository.save(role);

    }

    @Override
    public Role findById(long l) {
        return this.roleRepository.findById(l).get();
    }

//    private Role userRepository;
//
//    public RoleServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public User createUser(User user) throws UserExistException {
//
//        if (user !=null){
//            if (userRepository.findByEmail(user.getEmail()) == null){
//                userRepository.save(user);
//                return user;
//            }
//            throw new UserExistException(user);
//        }
//        return user;
//    }
}
