package com.technologyassessment.technologyassessment.controller;

import com.technologyassessment.technologyassessment.controller.dto.request.DiscountRequest;
import com.technologyassessment.technologyassessment.service.DiscountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/v1/discounts")
public class DiscountController {

    private DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @PostMapping
    public BigDecimal createDiscount(@RequestBody DiscountRequest request) {
        return discountService.discountCalculation(request.getUser(), request.getBill());
    }

}