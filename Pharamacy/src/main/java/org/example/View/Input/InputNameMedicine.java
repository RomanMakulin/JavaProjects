package org.example.View.Input;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class InputNameMedicine implements InputString {
    @Override
    public String input(){
        System.out.print("Medicine name: ");
        return new Scanner(System.in).nextLine();
    }
}
