package com.company.module01.example2;

import com.company.module01.dominio.User;

import java.util.ArrayList;
import java.util.List;

public class MainClass02Lambda {

    public static void main(String[] args) {

        ArrayList<User> usersArrayList = new ArrayList<User>();

        usersArrayList.add(new User("Omar", "Ortiz3", 32));
        usersArrayList.add(new User("Alejandro", "Ortiz4", 33));
        usersArrayList.add(new User("Adrian", "Ortiz1", 31));
        usersArrayList.add(new User("Luis", "Ortiz2", 36));
        usersArrayList.add(new User("Karen", "Olvera", 29));

        // List<User> newList = findUserByFilter(new FilterUserName("Adrian"), usersArrayList);
        // List<User> newList = findUserByFilter(new FilterUserLastName("Olvera"), usersArrayList);

        // Lambda expression
        // List<User> newList = findUserByFilter((u) -> u.getLastName().equals("Olvera"), usersArrayList);
        List<User> newList = findUserByFilter((u) -> u.getName().equals("Karen"), usersArrayList);

        for (User user: newList) {
            System.out.printf("User : %s %s %s %n", user.getName(), user.getLastName(), user.getAge());
        }
    }

    public static List<User> findUserByFilter(FilterUser filter, List<User> usersList) {

        List<User> filterList = new ArrayList<User>();

        for (User u: usersList) {
            if (filter.test(u)) {
                filterList.add(u);
            }
        }

        return filterList;
    }

}
