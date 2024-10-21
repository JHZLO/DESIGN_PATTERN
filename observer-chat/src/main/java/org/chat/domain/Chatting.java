package org.chat.domain;

import org.chat.view.ChatDisplay;

public class Chatting {
    private String name;
    private String content;

    ChatDisplay chatDisplay = new ChatDisplay();

    public void setChatting(String name, String content) {
        this.name = name;
        this.content = content;
        notifyChat();
    }

    private void notifyChat() {
        chatDisplay.update(getName(), getContent());
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}
