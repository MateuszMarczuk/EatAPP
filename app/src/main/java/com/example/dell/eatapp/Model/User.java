package com.example.dell.eatapp.Model;

/**
 * Created by dell on 10.02.2018.
 */

public class User {

    private String User;
    private String Password;

    public User() {
    }

    public User(String user, String password) {
        User = user;
        Password = password;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
