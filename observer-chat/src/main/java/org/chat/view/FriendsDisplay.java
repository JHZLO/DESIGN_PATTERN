package org.chat.view;

import java.util.ArrayList;
import org.chat.domain.ChatService;
import org.chat.domain.Friend;

public class FriendsDisplay implements Display {
    private ChatService chatService;
    private ArrayList<Friend> friends;

    public FriendsDisplay(ChatService chatService){
        this.chatService = chatService;
    }

    @Override
    public void update(){
        this.friends = chatService.getFriends();
        display();
    }

    private void display() {
        int cnt = 1;
        System.out.println("=============친구 목록============");
        for (Friend myFriend : friends) {
            System.out.println("번호: " + cnt + " | 이름: " + myFriend.getName() + " | 나이: " + myFriend.getAge());
            cnt++;
        }
    }
}
