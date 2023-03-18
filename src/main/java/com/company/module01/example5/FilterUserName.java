package com.company.module01.example5;

import com.company.module01.dominio.User;

public class FilterUserName implements Filter<User> {

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
