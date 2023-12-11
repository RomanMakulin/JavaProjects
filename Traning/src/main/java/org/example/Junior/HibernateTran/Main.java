package org.example.Junior.HibernateTran;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DB dataBase = new DB();

        dataBase.deleteAllUsers();
        dataBase.createUser(Arrays.asList(
                new User("Roman", 25),
                new User("Ann", 21),
                new User("Olga", 50),
                new User("Milka", 2)));
        dataBase.showAllUsersInConsole();
        dataBase.updateUserAge(9, 55);
        dataBase.deleteOneUserByID(8);
        dataBase.showAllUsersInConsole();
    }
}
