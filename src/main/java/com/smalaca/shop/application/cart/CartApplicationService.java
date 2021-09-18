package com.smalaca.shop.application.cart;

import com.smalaca.shop.domain.cart.CartId;
import com.smalaca.shop.domain.order.OrderId;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CartApplicationService {
    public void add(CartId cartId, UUID productId) {

    }

    public OrderId confirm(CartId cartId, CartConfirmationDto cartConfirmationDto) {
        return null;
    }
}
