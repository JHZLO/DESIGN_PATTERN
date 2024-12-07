package org.network.src.model.strategies.connect;

public class WeakSignal implements ConnectSignal{
    @Override
    public void signal(){
        System.out.println("약한 신호로 연결되었습니다.");
    }
}
