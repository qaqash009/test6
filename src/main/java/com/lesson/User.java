package com.lesson;

import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private String username;

    public User() {

    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public User(String name, String surname, String username) {
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User " +
                "name= " + name + '\'' +
                ", surname= " + surname + '\'' +
                ", username= " + username + '\'' +
                '}';
    }
}
