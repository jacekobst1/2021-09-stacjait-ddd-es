package com.smalaca.shop.infrastructure.api.rest.order;

import com.smalaca.shop.application.order.OrderApplicationService;
import com.smalaca.shop.application.order.OrderCommentsDto;
import com.smalaca.shop.query.order.OrderQueryDao;
import com.smalaca.shop.query.order.OrderSummaryDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderApplicationService orderApplicationService;
    private final OrderQueryDao orderQueryDao;

    public OrderController(OrderApplicationService orderApplicationService, OrderQueryDao orderQueryDao) {
        this.orderApplicationService = orderApplicationService;
        this.orderQueryDao = orderQueryDao;
    }

    @PutMapping
    public OrderSummaryDto accept(@RequestBody OrderCommentsDto orderCommentsDto) {
        UUID orderId = getOrderIdForCurrentUser();

        orderApplicationService.accept(orderId, orderCommentsDto);
        return orderQueryDao.findBy(orderId);
    }

    private UUID getOrderIdForCurrentUser() {
        return null;
    }
}
