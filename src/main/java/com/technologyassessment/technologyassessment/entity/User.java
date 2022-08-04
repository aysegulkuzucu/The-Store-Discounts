package com.technologyassessment.technologyassessment.entity;

import com.technologyassessment.technologyassessment.entity.enums.UserType;

import java.time.LocalDate;

public class User {

    private UserType type;

    private LocalDate registerDate;

    public User(UserType type, LocalDate registerDate) {
        this.type = type;
        this.registerDate = registerDate;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
}
