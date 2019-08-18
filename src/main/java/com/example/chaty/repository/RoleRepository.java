package com.example.chaty.repository;

import com.example.chaty.model.Role;
import com.example.chaty.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
