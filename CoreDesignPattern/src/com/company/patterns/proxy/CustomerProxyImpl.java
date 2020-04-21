package com.company.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {
    Customer customer = new CustomerImpl();
    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        Order order = new Order();
        order.setId(1);
        order.setProductName("Sipper");
        order.setQuantity(2);
        orders.add(order);
        return orders;
    }
}
