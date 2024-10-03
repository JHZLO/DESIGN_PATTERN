package org.network.src.model.strategies.connect;

public class NormalSignal implements ConnectSignal {
    @Override
    public void signal(){
        System.out.println("중간 신호로 연결되었습니다.");
    }
}
