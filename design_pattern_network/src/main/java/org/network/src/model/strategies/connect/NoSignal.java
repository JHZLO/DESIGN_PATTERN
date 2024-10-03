package org.network.src.model.strategies.connect;

public class NoSignal implements ConnectSignal {
    @Override
    public void signal(){
        System.out.println("연결되지 못하였습니다.");
    }
}
