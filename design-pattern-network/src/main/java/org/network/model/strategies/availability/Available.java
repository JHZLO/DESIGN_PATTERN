package org.network.src.model.strategies.availability;

public class Available implements Availability {
    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public void printAvailable() {
        System.out.println("정상적으로 연결이 가능합니다.");
    }
}
