package com.company.module01.example6;

import com.company.module01.dominio.User;

import java.util.function.Predicate;

public class FilterUserLastName implements Predicate<User> {

    private String lastName;

    public FilterUserLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean test(User user) {

        if (user.getLastName().equals(lastName)) {
            return true;
        } else {
            return false;
        }
    }

}
