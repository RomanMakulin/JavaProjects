package org.example.View;

import java.util.Scanner;

public class InputPriceMedicine {
    public int input(){
        System.out.println("Введите стоимость препарата: ");
        return new Scanner(System.in).nextInt();
    }
}
