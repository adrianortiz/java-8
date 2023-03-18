package com.company.module01.dominio;

public class User implements Comparable<User>{

    private String name;
    private String lastName;
    private int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User other) {
        return this.getName().compareTo(other.getName());
    }

    // Using Scope, It is a instance Method
    public boolean isRetired() {
        return this.getAge() > 65;
    }
}
