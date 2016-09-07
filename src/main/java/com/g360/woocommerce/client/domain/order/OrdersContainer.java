package com.g360.woocommerce.client.domain.order;

import java.util.ArrayList;
import java.util.List;

public class OrdersContainer {

    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}