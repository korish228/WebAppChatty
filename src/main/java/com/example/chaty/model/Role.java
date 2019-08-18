package com.example.chaty.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private Long id;

    private String name;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "role")
    private List<User> users;


    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }

    @JsonManagedReference
    public List<User> getUsers() {
        return users;
    }
}
