package com.example.chaty.repository;

import com.example.chaty.model.ChatUser;
import com.example.chaty.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ChatUserRepository extends JpaRepository<ChatUser, Long> {

    @Modifying
    @Query("UPDATE ChatUser u SET u.name = ?1 WHERE u.id = ?2")
    public ChatUser update(String name, long id);

    ChatUser findChatUserByName(String name);

    ChatUser findChatUserByUserEmail(String email);

    ChatUser findChatUserByUserId(Long id);

}
