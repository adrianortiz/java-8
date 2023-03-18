package com.company.module01.example5;

import com.company.module01.dominio.User;

public class FilterUserLastName implements Filter<User> {

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
