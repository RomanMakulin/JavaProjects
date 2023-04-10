package org.example.View;

import java.util.Scanner;

public class InputLogin {
    public String input(){
        System.out.println("Введите имя пользователя: ");
        return new Scanner(System.in).nextLine();
    }
}
