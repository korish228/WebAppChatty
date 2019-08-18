package com.example.chaty.controller;

import com.example.chaty.model.ChatUser;
import com.example.chaty.repository.ChatUserRepository;
import com.example.chaty.service.ChatUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class ChatUserController {

    private ChatUserService chatUserService;

    public ChatUserController(ChatUserService chatUserService) {
        this.chatUserService = chatUserService;
    }

    @PutMapping("/updateUser")
    public String update(@ModelAttribute("chatUser") ChatUser chatUser){

        System.out.println(chatUser);

        this.chatUserService.update(chatUser);

        return "authorized/success";

    }


//    @GetMapping("/allChatUsers")
//    public List<ChatUser> getUsers(){
//        return chatUserService.getAll();
//    }


}
