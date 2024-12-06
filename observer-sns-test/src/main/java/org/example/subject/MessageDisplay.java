package org.example.subject;

import org.example.observer.ChatService;

public class MessageDisplay implements Display {
    private ChatService chatService;

    public MessageDisplay(ChatService chatService){
        this.chatService = chatService;
    }
    @Override
    public void update() {
        display(chatService.getMessage());
    }

    public void display(String message) {
        System.out.println(message);
    }
}
