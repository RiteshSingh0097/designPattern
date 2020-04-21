package com.company.patterns.factory;

import java.util.Objects;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza p = PizzaFactory.createPizza(type);
        if (Objects.nonNull(p)) {
            p.prepare();
            p.bake();
            p.cut();
        }
        return p;
    }
}
