package org.chat.domain;

import java.util.ArrayList;

public class ChatService extends DataSource {
    private ArrayList<Friend> friends;
    private ArrayList<Message> messages;

    public ChatService() {
        this.friends = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    private void chatChange() {
        myNotify();
    }

    public void addFriend(Friend friend) {
        friends.add(friend);
        chatChange();
    }

    public void deleteFriend(Friend friend) {
        friends.remove(friend);
        chatChange();
    }

    public void sendMessage(Message message) {
        messages.add(message);
        chatChange();
    }

    public ArrayList<Friend> getFriends() {
        return friends;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }
}
