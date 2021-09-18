package com.smalaca.shop.domain.order;

import com.smalaca.shop.domain.price.Price;

public class Order {
    private final Price price;

    public Order(Price price) {
        this.price = price;
    }
}
