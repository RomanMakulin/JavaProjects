package org.example.View;

import java.util.Scanner;

public class InputPassword {
    public int input(){
        System.out.println("Введите пароль: ");
        return new Scanner(System.in).nextInt();
    }
}
