package org.network.src.model.strategies.connect;

public class StrongSignal implements ConnectSignal{
    @Override
    public void signal(){
        System.out.println("강한 신호로 연결되었습니다.");
    }
}
