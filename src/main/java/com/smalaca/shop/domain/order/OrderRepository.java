package com.smalaca.shop.domain.order;

public interface OrderRepository {
    OrderId save(Order order);
}
