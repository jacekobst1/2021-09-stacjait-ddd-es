package com.smalaca.shop.query.product;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class ProductQueryDao {
    public List<ProductDto> findAll(SearchCriteria searchCriteria) {
        return null;
    }

    public ProductDetailsDto findBy(UUID productId) {
        return null;
    }
}
