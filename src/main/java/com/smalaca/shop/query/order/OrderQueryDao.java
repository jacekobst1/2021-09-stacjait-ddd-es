package com.smalaca.shop.query.order;

import com.smalaca.shop.domain.order.OrderId;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class OrderQueryDao {
    public OrderSummaryDto findSummaryBy(UUID orderId) {
        return null;
    }

    public OrderDto findBy(OrderId orderId) {
        return null;
    }
}
