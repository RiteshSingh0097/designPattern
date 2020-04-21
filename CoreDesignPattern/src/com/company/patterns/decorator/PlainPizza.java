package com.company.patterns.decorator;

public class PlainPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking plane pizza");
    }
}
