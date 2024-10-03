package org.network.src.model;

import org.network.src.model.strategies.availability.Available;
import org.network.src.model.strategies.connect.WeakSignal;

public class BluetoothConnector extends Connector {
    public BluetoothConnector(){
        availability = new Available();
        connectSignal = new WeakSignal(); // 블루투스는 약한신호로 연경
    }
    public void display(){
        System.out.println("Bluetooth Connector 입니다.");
    }
}
