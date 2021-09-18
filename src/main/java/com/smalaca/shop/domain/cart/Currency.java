package com.smalaca.shop.domain.cart;

public class Currency {
    private final String currency;

    private Currency(String currency) {
        this.currency = currency;
    }

    public static Currency from(String currency) {
        if (isValidCurrency(currency)) {
            return new Currency(currency);
        }

        throw new InvalidCurrencyException(currency);
    }

    private static boolean isValidCurrency(String currency) {
        return "PLN".equals(currency) || "EUR".equals(currency);
    }
}
