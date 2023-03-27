package com.tommisaarnio.myapplication2;

import java.util.ArrayList;

public class UserStorage {
    ArrayList<User> userList = new ArrayList<>();
    private static UserStorage userStorage = null;

    private UserStorage() {
    }

    public static UserStorage getInstance() {
        if (userStorage == null) {
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public ArrayList<User> getUsers() {
        return userList;
    }
}
