package org.chat.domain;

import java.util.ArrayList;
import org.chat.view.Display;

public class ChatService {
    private ArrayList<Friend> friends;
    private ArrayList<Message> messages;

    ArrayList<Display> displays = new ArrayList<>();

    public ChatService() {
        this.friends = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public void attach(Display display){
        displays.add(display);
    }

    public void detach(Display display){
        displays.remove(display);
    }

    private void chatChange(){
        for(Display myDisplay : displays){
            myDisplay.update();
        }
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
