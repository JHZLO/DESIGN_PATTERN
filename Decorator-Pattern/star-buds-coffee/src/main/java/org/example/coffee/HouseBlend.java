package org.example.coffee;

import org.example.Beverage;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "하우스 블렌드";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
