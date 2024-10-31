package org.example;

import java.util.Scanner;
import org.example.observer.ChatService;
import org.example.participants.Announcer;
import org.example.participants.General;
import org.example.participants.Monitor;
import org.example.participants.Participant;
import org.example.subject.MessageDisplay;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ChatService chatService = new ChatService();
        chatService.addParticipant(new Announcer("Announcer"));
        chatService.addParticipant(new General("You"));
        chatService.addParticipant(new General("Me"));
        chatService.addParticipant(new Monitor("Monitor"));

        chatService.addAttach(new MessageDisplay(chatService));

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            chatService.addMessage(line);
        }
    }
}
