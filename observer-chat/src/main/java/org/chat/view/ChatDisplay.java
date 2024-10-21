package org.chat.view;

public class ChatDisplay {
    private String name;
    private String content;

    public void update(String name, String content){
        this.name = name;
        this.content = content;
        display();
    }

    private void display(){
        System.out.println("=============채팅 내역============");
        System.out.println(this.name + ": " + this.content);
    }
}