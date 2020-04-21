package com.company.patterns.factory;

public class TestPizza {

    public static void main(String[] args) {

        PizzaStore ps = new PizzaStore();
        ps.orderPizza("veggie");
    }
}
