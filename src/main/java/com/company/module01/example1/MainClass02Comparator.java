package com.company.module01.example1;

import com.company.module01.dominio.User;
import com.company.module01.example1.comparators.LastNameComparator;

import java.util.ArrayList;

public class MainClass02Comparator {

    public static void main(String[] args) {

        ArrayList<User> usersArrayList = new ArrayList<User>();

        usersArrayList.add(new User("Omar", "Ortiz3", 32));
        usersArrayList.add(new User("Alejandro", "Ortiz4", 33));
        usersArrayList.add(new User("Adrian", "Ortiz1", 31));
        usersArrayList.add(new User("Luis", "Ortiz2", 36));
        usersArrayList.add(new User("Karen", "Olvera", 29));

        // usersArrayList.sort(new NameComparator());
        usersArrayList.sort(new LastNameComparator());

        for (User user: usersArrayList) {
            System.out.printf("User : %s %s %s %n", user.getName(), user.getLastName(), user.getAge());
        }

    }
}
