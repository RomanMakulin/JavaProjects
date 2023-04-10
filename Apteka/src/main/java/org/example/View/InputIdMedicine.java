package org.example.View;

import java.util.Scanner;

public class InputIdMedicine {
    public int input(){
        System.out.println("Введите ID препарата для редактирования: ");
        return new Scanner(System.in).nextInt();
    }
}
