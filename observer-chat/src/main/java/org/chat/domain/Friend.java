package org.chat.domain;

import org.chat.view.FriendsDisplay;

public class Friend {
    private final String name;
    private final Integer age;
    private final String phoneNumber;


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

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
