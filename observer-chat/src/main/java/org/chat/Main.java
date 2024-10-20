package org.chat;

public class Main {
    public static void main(String[] args) {
        Friends friends = new Friends();
        Chatting chatting = new Chatting();

        friends.setFriends("김준형",24,"010-0000-0000");
        chatting.setChatting("김준형", "안녕하세요!");
    }
}
