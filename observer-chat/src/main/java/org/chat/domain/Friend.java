package org.chat.domain;

import org.chat.view.FriendsDisplay;

public class Friend {
    private String name;
    private Integer age;
    private String phoneNumber;

    FriendsDisplay friendsDisplay = new FriendsDisplay();

    public Friend(String name, Integer age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }
}
