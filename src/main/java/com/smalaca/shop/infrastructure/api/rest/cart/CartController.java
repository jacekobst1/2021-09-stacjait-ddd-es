package com.smalaca.shop.infrastructure.api.rest.cart;

import com.smalaca.shop.application.cart.CartApplicationService;
import com.smalaca.shop.application.cart.CartConfirmationDto;
import com.smalaca.shop.domain.cart.CartId;
import com.smalaca.shop.domain.order.OrderId;
import com.smalaca.shop.query.cart.CartDto;
import com.smalaca.shop.query.cart.CartQueryDao;
import com.smalaca.shop.query.order.OrderDto;
import com.smalaca.shop.query.order.OrderQueryDao;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cart")
public class CartController {
    private final CartApplicationService cartApplicationService;
    private final CartQueryDao cartQueryDao;
    private final OrderQueryDao orderQueryDao;

    public CartController(
            CartApplicationService cartApplicationService, CartQueryDao cartQueryDao, OrderQueryDao orderQueryDao) {
        this.cartApplicationService = cartApplicationService;
        this.cartQueryDao = cartQueryDao;
        this.orderQueryDao = orderQueryDao;
    }

    @PutMapping("/{productId}")
    public void addProduct(@PathVariable UUID productId) {
        CartId cartId = getCartIdOfCurrentUser();

        cartApplicationService.add(cartId, productId);
    }

    @GetMapping
    public CartDto choose() {
        return cartQueryDao.findBy(getCartIdOfCurrentUser());
    }

    @PutMapping
    public OrderDto confirm(@RequestBody CartConfirmationDto cartConfirmationDto) {
        CartId cartId = getCartIdOfCurrentUser();
        OrderId orderId = cartApplicationService.confirm(cartId, cartConfirmationDto);

        return orderQueryDao.findBy(orderId);
    }

    private CartId getCartIdOfCurrentUser() {
        return null;
    }
}
