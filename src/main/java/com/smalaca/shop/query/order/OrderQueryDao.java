package com.smalaca.shop.query.order;

import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class OrderQueryDao {
    public OrderSummaryDto findBy(UUID orderId) {
        return null;
    }
}
