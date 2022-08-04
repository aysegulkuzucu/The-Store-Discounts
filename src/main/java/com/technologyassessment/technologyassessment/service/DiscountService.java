package com.technologyassessment.technologyassessment.service;

import com.technologyassessment.technologyassessment.entity.Bill;
import com.technologyassessment.technologyassessment.entity.User;

import java.math.BigDecimal;

public interface DiscountService {

    BigDecimal discountCalculation(User user, Bill bill);
}
