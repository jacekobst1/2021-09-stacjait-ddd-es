package com.smalaca.shop.application.cart;

import com.smalaca.shop.domain.cart.Currency;
import com.smalaca.shop.domain.cart.Cart;
import com.smalaca.shop.domain.cart.CartId;
import com.smalaca.shop.domain.cart.CartRepository;
import com.smalaca.shop.domain.order.Order;
import com.smalaca.shop.domain.order.OrderId;
import com.smalaca.shop.domain.order.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CartApplicationService {
    private final CartRepository cartRepository;
    private final OrderRepository orderRepository;

    public CartApplicationService(CartRepository cartRepository, OrderRepository orderRepository) {
        this.cartRepository = cartRepository;
        this.orderRepository = orderRepository;
    }

    public void add(CartId cartId, UUID productId) {

    }

    public OrderId confirm(CartId cartId, CartConfirmationDto cartConfirmationDto) {
        // transformacja inputu na obiekty domenowe = (0-*)
        Cart cart = cartRepository.findBy(cartId);
        Currency currency = Currency.from(cartConfirmationDto.getCurrency());

        // wywowłanie metody na obiekcie domenowym = 1
        Order order = cart.confirm(currency);

        // zapis wyniku operacji = (0-*)
        return orderRepository.save(order);
    }
}
