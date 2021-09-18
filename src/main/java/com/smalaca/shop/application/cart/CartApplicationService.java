package com.smalaca.shop.application.cart;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CartApplicationService {
    public void add(UUID productId, UUID cartId) {

    }

    public UUID confirm(UUID cartId, CartConfirmationDto cartConfirmationDto) {
        return null;
    }
}
