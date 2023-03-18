package com.company.module01.example5;

import com.company.module01.dominio.User;

import java.util.ArrayList;
import java.util.List;

public class MainClass01ReferenceMethodExtendsGeneric {

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
        Filter<User> filterAdrian = new FilterUserName("Adrian");
        Filter<User> filterPerezOrAdrian = filterAdrian.or(new FilterUserLastName("Perez"));
        Filter<User> filterIsRetired = filterPerezOrAdrian.or(User::isRetired);

        List<User> newList = findUserByFilter(filterIsRetired, usersArrayList);

        for (User user: newList) {
            System.out.printf("User : %s %s %s %n", user.getName(), user.getLastName(), user.getAge());
        }
    }

    public static List<User> findUserByFilter(Filter filter, List<User> usersList) {

        List<User> filterList = new ArrayList<User>();

        for (User u: usersList) {
            if (filter.test(u)) {
                filterList.add(u);
            }
        }

        return filterList;
    }

}
