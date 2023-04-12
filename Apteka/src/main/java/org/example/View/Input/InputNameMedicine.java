package org.example.View.Input;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class InputNameMedicine implements InputString {
    @Override
    public String input(){
        System.out.println("Введите название препарата: ");
        return new Scanner(System.in).nextLine();
    }
}
