package com.technologyassessment.technologyassessment.service;

import com.technologyassessment.technologyassessment.entity.Bill;
import com.technologyassessment.technologyassessment.entity.User;
import com.technologyassessment.technologyassessment.entity.enums.ProductType;
import com.technologyassessment.technologyassessment.utils.DiscountUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DiscountServiceImpl implements DiscountService{

    @Override
    public BigDecimal discountCalculation(User user, Bill bill) {
        DiscountUtil cal = new DiscountUtil();

        BigDecimal totalAmount = cal.calculateTotal(bill.getProducts());
        BigDecimal phonesAmount = cal.calculateTotalPerType(bill.getProducts(), ProductType.PHONES);
        BigDecimal nonPhonesAmount = totalAmount.subtract(phonesAmount);
        BigDecimal userDiscount = cal.getUserDiscount(user);
        BigDecimal billsDiscount = cal.calculateBillsDiscount(totalAmount,  BigDecimal.valueOf(200), BigDecimal.valueOf(5));

        if(nonPhonesAmount.compareTo(BigDecimal.ZERO) > 0) {
            nonPhonesAmount = cal.calculateDiscount(nonPhonesAmount,userDiscount);
        }

        return phonesAmount.add(nonPhonesAmount).subtract(billsDiscount);
    }
}
