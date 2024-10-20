package org.chat;

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
        System.out.println("이름 : " + this.name + " | 내용 : " + this.content);
    }
}
