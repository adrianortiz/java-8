package com.company.module01.example1.comparators;

import com.company.module01.dominio.User;
import java.util.Comparator;

public class NameComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        return user1.getName().compareTo(user2.getName());
    }
}
