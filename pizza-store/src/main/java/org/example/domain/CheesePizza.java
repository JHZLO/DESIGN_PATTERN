package org.example.domain;

public class CheesePizza extends Pizza{
    @Override
    public void prepare(){
        System.out.println("CheesePizza");
    }
}
