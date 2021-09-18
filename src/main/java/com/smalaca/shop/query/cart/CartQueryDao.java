package com.smalaca.shop.query.cart;

import com.smalaca.shop.domain.cart.CartId;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class CartQueryDao {
    public CartDto findBy(CartId cartIdOfCurrentUser) {
        return null;
    }
}
