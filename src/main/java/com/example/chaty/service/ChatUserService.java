package com.example.chaty.service;

import com.example.chaty.exceptions.UserExistException;
import com.example.chaty.model.ChatUser;
import com.example.chaty.model.User;

import java.util.List;

public interface ChatUserService {

    ChatUser createChatUser(User user) throws UserExistException;

    List<ChatUser> getAll();

    ChatUser update(ChatUser chatUser);

    ChatUser findChatUserByUserEmail(String name);

    ChatUser findByUserId(Long id);
}
