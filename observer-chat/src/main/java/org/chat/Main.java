package org.chat;

import org.chat.domain.Chatting;
import org.chat.domain.Friend;
import org.chat.domain.Friends;

public class Main {
    public static void main(String[] args) {
        Friends friends = new Friends();
        Chatting chatting = new Chatting();

        friends.addFriend(new Friend("김준형",24,"010-0000-0000"));
        friends.addFriend(new Friend("홍길동",22,"010-0000-0000"));
        friends.addFriend(new Friend("김철수",21,"010-0000-0000"));
        chatting.setChatting("김준형", "안녕하세요!");
    }
}
