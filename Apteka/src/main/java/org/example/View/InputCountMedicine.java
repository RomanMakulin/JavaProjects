package org.example.View;

import java.util.Scanner;

public class InputCountMedicine {
    public int input(){
        System.out.println("Введите кол-во препарата: ");
        return new Scanner(System.in).nextInt();
    }
}
