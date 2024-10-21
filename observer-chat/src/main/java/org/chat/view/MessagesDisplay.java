package org.chat.view;

import java.util.ArrayList;
import org.chat.domain.ChatService;
import org.chat.domain.Message;

public class MessagesDisplay implements Display {
    ChatService chatService;
    private ArrayList<Message> messages;

    public MessagesDisplay(ChatService chatService){
        this.chatService = chatService;
    }

    @Override
    public void update(){
        this.messages = chatService.getMessages();
        display();
    }

    private void display(){
        System.out.println("=============채팅 내역============");
        for (Message myMessage : messages) {
            System.out.println(myMessage.getName() + " : " + myMessage.getContent());
        }
        System.out.println();
    }
}
