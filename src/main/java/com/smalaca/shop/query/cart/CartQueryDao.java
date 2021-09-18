package com.smalaca.shop.query.cart;

import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class CartQueryDao {
    public CartDto findBy(UUID cartIdOfCurrentUser) {
        return null;
    }
}
