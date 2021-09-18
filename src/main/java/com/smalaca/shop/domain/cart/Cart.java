package com.smalaca.shop.domain.cart;

import com.smalaca.shop.domain.order.Order;
import com.smalaca.shop.domain.price.Price;

public class Cart {
    public Order confirm(Currency currency) {
        Price price = calculateCost(currency);

        return new Order(price);
    }

    private Price calculateCost(Currency currency) {
        return null;
    }
}
