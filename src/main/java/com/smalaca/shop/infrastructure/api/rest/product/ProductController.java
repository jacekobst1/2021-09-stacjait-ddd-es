package com.smalaca.shop.infrastructure.api.rest.product;

import com.smalaca.shop.query.product.ProductDetailsDto;
import com.smalaca.shop.query.product.ProductDto;
import com.smalaca.shop.query.product.ProductQueryDao;
import com.smalaca.shop.query.product.SearchCriteria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductQueryDao productQueryDao;

    ProductController(ProductQueryDao productQueryDao) {
        this.productQueryDao = productQueryDao;
    }

    @GetMapping
    public List<ProductDto> findAll(@RequestBody SearchCriteria searchCriteria) {
        return productQueryDao.findAll(searchCriteria);
    }

    @GetMapping("/{productId}")
    public ProductDetailsDto display(UUID productId) {
        return productQueryDao.findBy(productId);
    }
}
