package org.example.View;

import java.util.Scanner;

public class Input {
    public String input(){
        System.out.println("Введите номер действия: ");
        return new Scanner(System.in).nextLine();
    }
}
