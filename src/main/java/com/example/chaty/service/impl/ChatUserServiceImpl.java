package com.example.chaty.service.impl;

import com.example.chaty.exceptions.UserExistException;
import com.example.chaty.model.ChatUser;
import com.example.chaty.model.User;
import com.example.chaty.repository.ChatUserRepository;
import com.example.chaty.repository.UserRepository;
import com.example.chaty.service.ChatUserService;
import com.example.chaty.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatUserServiceImpl implements ChatUserService {

    private ChatUserRepository chatUserRepository;

    public ChatUserServiceImpl(ChatUserRepository chatUserRepository) {
        this.chatUserRepository = chatUserRepository;
    }

    @Override
    public ChatUser createChatUser(User user){

        ChatUser chatUser = new ChatUser();
        chatUser.setUser(user);

         return chatUserRepository.save(chatUser);
    }

    @Override
    public List<ChatUser> getAll() {
        return chatUserRepository.findAll();
    }

    @Override
    public ChatUser update(ChatUser chatUser) {

        System.out.println(chatUser);

        chatUser = this.chatUserRepository.update(chatUser.getName(), chatUser.getId());

        return chatUser;
    }

    @Override
    public ChatUser findChatUserByUserEmail(String email) {
        return chatUserRepository.findChatUserByUserEmail(email);
    }

    @Override
    public ChatUser findByUserId(Long id) {
        return this.chatUserRepository.findChatUserByUserId(id);
    }
}
