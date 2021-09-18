package com.smalaca.shop.application.cart;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter(AccessLevel.PACKAGE)
public class CartConfirmationDto {
    private final String currency;
}
