package com.technologyassessment.technologyassessment.controller.dto.request;

import com.technologyassessment.technologyassessment.entity.Bill;
import com.technologyassessment.technologyassessment.entity.User;

public class DiscountRequest {
    User user;

    Bill bill;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
