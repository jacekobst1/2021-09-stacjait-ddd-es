package com.smalaca.shop.domain.cart;

public class InvalidCurrencyException extends RuntimeException {
    private final String currency;

    InvalidCurrencyException(String currency) {
        this.currency = currency;
    }
}
