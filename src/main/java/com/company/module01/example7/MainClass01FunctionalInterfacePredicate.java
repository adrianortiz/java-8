package com.company.module01.example7;

import com.company.module01.dominio.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainClass01FunctionalInterfacePredicate {

    public static void main(String[] args) {

        ArrayList<User> usersArrayList = new ArrayList<User>();

        usersArrayList.add(new User("Omar", "Martinez", 32));
        usersArrayList.add(new User("Alejandro", "Gomez", 33));
        usersArrayList.add(new User("Adrian", "Ortiz", 31));
        usersArrayList.add(new User("Luis", "Diaz", 36));
        usersArrayList.add(new User("Karen", "Olvera", 29));
        usersArrayList.add(new User("Fernando", "Perez", 28));
        usersArrayList.add(new User("Miranda", "Ortega", 68));

        // Reference Method is like a Lambda Expression but in a class
        Predicate<User> filterByName = new FilterUserName("Adrian");
        Predicate<User> filterByLastName = new FilterUserLastName("Perez");
        Predicate<User> filterByIsRetired = User::isRetired;

        List<User> newList = findUserByFilter(FilterUser.orMultiple(filterByName, filterByLastName, filterByIsRetired), usersArrayList);

        for (User user: newList) {
            System.out.printf("User : %s %s %s %n", user.getName(), user.getLastName(), user.getAge());
        }
    }

    public static List<User> findUserByFilter(Predicate filter, List<User> usersList) {

        List<User> filterList = new ArrayList<User>();

        for (User u: usersList) {
            if (filter.test(u)) {
                filterList.add(u);
            }
        }

        return filterList;
    }

}
