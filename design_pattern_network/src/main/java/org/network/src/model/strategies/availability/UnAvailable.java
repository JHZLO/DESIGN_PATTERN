package org.network.src.model.strategies.availability;

public class UnAvailable implements Availability{
    @Override
    public boolean isAvailable(){
        return false;
    }

    @Override
    public void printAvailable() {
        System.out.println("연결할 수 없습니다.");
    }
}
