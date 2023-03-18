package com.company.module01.example7;

import com.company.module01.dominio.User;
import java.util.function.Predicate;

public interface FilterUser extends Predicate<User> {

    // '...' The ability to pass multiple parameters of the same type
    public static Predicate<User> orMultiple(Predicate<User> ...predicates) {

        Predicate<User> combinePredicates = predicates[0];

        for (Predicate<User> predicate : predicates) {
            combinePredicates = combinePredicates.or(predicate);
        }

        return combinePredicates;
    }
}
