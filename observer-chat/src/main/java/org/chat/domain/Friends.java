package org.chat.domain;

import java.util.ArrayList;
import org.chat.view.FriendsDisplay;

public class Friends {
    private ArrayList<Friend> friends;

    FriendsDisplay friendsDisplay = new FriendsDisplay();

    public Friends() {
        this.friends = new ArrayList<>();
    }

    private void notifyFriends() {
        friendsDisplay.update();
    }

    public void addFriend(Friend friend) {
        friends.add(friend);
        notifyFriends();
        displayFriendList();
    }

    public void deleteFriend(Friend friend) {
        friends.remove(friend);
        notifyFriends();
        displayFriendList();
    }

    public void displayFriendList() {
        int cnt = 1;
        for (Friend myFriend : friends) {
            System.out.println("번호: " + cnt + " | 이름: " + myFriend.getName() + " | 나이: "+ myFriend.getAge());
            cnt ++;
        }
    }

}
