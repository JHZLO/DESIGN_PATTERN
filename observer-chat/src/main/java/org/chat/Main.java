package org.chat;

import org.chat.domain.ChatService;
import org.chat.domain.Friend;
import org.chat.domain.Message;

public class Main {
    public static void main(String[] args) {
        ChatService chatService = new ChatService();;

        chatService.addFriend(new Friend("김준형",24,"010-0000-0000"));
        chatService.addFriend(new Friend("홍길동",22,"010-0000-0000"));
        chatService.addFriend(new Friend("김철수",21,"010-0000-0000"));
        chatService.sendMessage(new Message("김준형", "안녕하세요!"));
        chatService.sendMessage(new Message("홍길동", "안녕하세요!"));
    }
}
