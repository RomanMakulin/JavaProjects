package org.example.Junior.HibernateTran;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        DB dataBase = new DB();
//
//        dataBase.deleteAllUsers();
//        dataBase.createUser(Arrays.asList(
//                new User("Roman", 25),
//                new User("Ann", 21),
//                new User("Olga", 50),
//                new User("Milka", 2)));
//        dataBase.showAllUsersInConsole();
//        dataBase.updateUserAge(9, 55);
//        dataBase.deleteOneUserByID(8);
//        dataBase.showAllUsersInConsole();

        char[] test1 = {'T', 'I', 'N', 'K', 'O', 'F', 'F'};
        char[] test2 = {1, 'I', 'N', 'K', 3, 'F', 'F'};
        char[] test3 = {'T', 'I', 'N', 'K', 'O', 'F', 'F', 'F'};
        char[] test4 = {'F', 'I', 'N', 'K', 'O', 'F', 'F'};

        checkLetters(test3);
    }

    public static void checkLetters(char[] test){
        String needLetters = "FFOKNIT";
        int needSize = needLetters.length();

        String finalResult = new StringBuilder(new String(test)).reverse().toString();
        if (finalResult.equals(needLetters))System.out.println("YES");
        else System.out.println("NO");
        if (finalResult.length() == needSize)System.out.println("YES");
        else System.out.println("NO");
    }
}
