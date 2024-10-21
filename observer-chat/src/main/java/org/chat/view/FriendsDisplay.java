package org.chat.view;

import org.chat.domain.Friends;

public class FriendsDisplay {
    private Friends friends;

    public FriendsDisplay(){
    }

    public void update(){
        display();
    }

    private void display(){
        System.out.println("=============친구 목록============");
    }
}
