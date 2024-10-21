package org.chat.domain;

public class Message {
    private final String name;
    private final String content;

    public Message(String name, String content){
        this.name = name;
        this.content = content;
    }

    public String getName(){
        return name;
    }

    public String getContent(){
        return content;
    }
}
