package org.example.observer;

import java.util.ArrayList;
import java.util.List;
import org.example.participants.Participant;

public class ChatService extends Observer {
    private final List<Participant> participants;
    private String message = null;

    public ChatService(){
        this.participants = new ArrayList<>();
    }

    public void addParticipant(Participant participant){
        participants.add(participant);
    }

    public void addMessage(String line){
        String[] part = line.split(" ");
        int index = Integer.parseInt(part[0]);
        participants.get(index).inputln(line);
        myNotify();
    }

    public String getMessage(){
        for(Participant participant : participants){
            message = message + participant;
        }
        return message;
    }
}
