package org.example.View;

import java.util.Scanner;

public class InputInt {
    public int input() {
        System.out.println("Введите аргумент: ");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
}
