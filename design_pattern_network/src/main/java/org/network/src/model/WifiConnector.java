package org.network.src.model;

import org.network.src.model.strategies.availability.Available;
import org.network.src.model.strategies.connect.StrongSignal;

public class WifiConnector extends Connector {
    public WifiConnector(){
        availability = new Available();
        connectSignal = new StrongSignal();
    }

    public void display(){
        System.out.println("Wifi Connector 입니다.");
    }
}
