package com.smalaca.shop.infrastructure.api.rest.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {
    public List<ProductDto> findAll(SearchCriteria searchCriteria) {
        return null;
    }

    public ProductDetailsDto display(UUID productId) {
        return null;
    }
}
