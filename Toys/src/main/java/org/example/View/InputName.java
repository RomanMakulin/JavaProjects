package org.example.View;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class InputName implements InputString {
    @Override
    public String input(){
        System.out.println("Введите название: ");
        return new Scanner(System.in).nextLine();
    }
}
