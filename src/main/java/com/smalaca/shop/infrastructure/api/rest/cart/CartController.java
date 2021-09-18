package com.smalaca.shop.infrastructure.api.rest.cart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/cart")
public class CartController {
    public void addProduct(UUID productId) {

    }

    public CartDto choose() {
        return null;
    }

    public OrderDto confirm(CartConfirmationDto cartConfirmationDto) {
        return null;
    }
}
