package org.example.View;

import java.util.Scanner;

public class InputNameMedicine {
    public String input(){
        System.out.println("Введите название препарата: ");
        return new Scanner(System.in).nextLine();
    }
}
