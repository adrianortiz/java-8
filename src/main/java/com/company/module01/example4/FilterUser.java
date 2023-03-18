package com.company.module01.example4;

import com.company.module01.dominio.User;

public interface FilterUser {

    public boolean test(User user);

    // Add 'or' under the Filter you have active
    default public FilterUser or (FilterUser filter) {
        return (User u) -> {
            return test(u) || filter.test(u);
        };
    }

}
