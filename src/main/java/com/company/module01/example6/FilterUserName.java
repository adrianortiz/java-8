package com.company.module01.example6;

import com.company.module01.dominio.User;

import java.util.function.Predicate;

public class FilterUserName implements Predicate<User> {

    private String name;

    public FilterUserName(String name) {
        this.name = name;
    }

    @Override
    public boolean test(User user) {

        if (user.getName().equals(name)) {
            return true;
        } else {
            return false;
        }
    }

}
