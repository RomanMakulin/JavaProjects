package org.example;

import org.example.DataBase.DB;
import org.example.Model.User;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DB dataBase = new DB();

        System.out.print("[UPDATE] Введите уникальный ID пользователя: ");
        int idInput = new Scanner(System.in).nextInt();

        dataBase.updateUserByID(idInput);
        dataBase.getAllUsers();

//        dataBase.createNewUsers(Arrays.asList(
//                new User("Роман", "Макулин", "Владимирович", 25,
//                        new Date(System.currentTimeMillis()), "some info", 1, 1,
//                        null, 0)));
    }
}