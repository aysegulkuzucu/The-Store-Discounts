package com.technologyassessment.technologyassessment.entity;

import com.technologyassessment.technologyassessment.entity.enums.ProductType;

import java.math.BigDecimal;

public class Product {

    private ProductType type;

    private BigDecimal price;

    public Product(ProductType type, BigDecimal price) {
        this.type = type;
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
