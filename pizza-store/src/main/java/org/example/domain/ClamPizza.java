package org.example.domain;

public class ClamPizza extends Pizza{
    @Override
    public void prepare(){
        System.out.println("preparing ClamPizza...");
    }
}
