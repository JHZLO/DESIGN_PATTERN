package org.chat.domain;

import java.util.ArrayList;

public class ChatService {
    private ArrayList<Friend> friends;
    private ArrayList<Message> messages;

    public ChatService(){
        this.friends = new ArrayList<>();
        this.messages = new ArrayList<>();
    }
    public void addFriend(Friend friend){
        friends.add(friend);
        displayFriendList();
    }

    public void deleteFriend(Friend friend){
        friends.remove(friend);
        displayFriendList();
    }

    public void sendMessage(Message message){
        messages.add(message);
        displayMessageList();
    }

    private void displayFriendList() {
        int cnt = 1;
        System.out.println("=============친구 목록============");
        for (Friend myFriend : friends) {
            System.out.println("번호: " + cnt + " | 이름: " + myFriend.getName() + " | 나이: "+ myFriend.getAge());
            cnt ++;
        }
    }

    private void displayMessageList() {
        System.out.println("=============채팅 내역============");
        for (Message myMessage : messages) {
            System.out.println(myMessage.getName() + " : "+ myMessage.getContent());
        }
    }
}
