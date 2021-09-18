package com.smalaca.shop.domain.cart;

public interface CartRepository {
    Cart findBy(CartId cartId);
}
