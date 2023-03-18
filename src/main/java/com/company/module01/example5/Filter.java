package com.company.module01.example5;

/**
 * Example for Functional programing
 * Class Filter works like Java Class Java.util.function.Predicate
 * test(T t), and(T t), or(T t), negative(T t)
 */

@FunctionalInterface
public interface Filter<T> {

    boolean test(T t);

    // Add 'or' under the Filter you have active
    default Filter<T> or (Filter<T> filter) {
        return (T t) -> {
            return test(t) || filter.test(t);
        };
    }

}
