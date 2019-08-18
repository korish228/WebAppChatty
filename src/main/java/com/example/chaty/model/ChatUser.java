package com.example.chaty.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class ChatUser {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToOne(fetch= FetchType.EAGER)
    private User user;

    @JsonBackReference
    public User getUser() {
        return user;
    }
}
