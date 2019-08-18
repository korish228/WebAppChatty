package com.example.chaty.service;

import com.example.chaty.model.Role;

public interface RoleService {
    Role createRole(Role role);

    Role findById(long l);
}
