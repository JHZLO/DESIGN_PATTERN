package org.network.src.model;

import org.network.src.model.strategies.availability.Availability;
import org.network.src.model.strategies.connect.ConnectSignal;

public abstract class Connector {
    protected Availability availability;
    protected ConnectSignal connectSignal;

    public abstract void display();

    public boolean isAvailable() {
        return availability.isAvailable();
    }

    public void printAvailable(){availability.printAvailable();}

    public void signal() {
        connectSignal.signal();
    }

    public void disconnect(){
        System.out.println("연결을 해제합니다.");
    }
}
