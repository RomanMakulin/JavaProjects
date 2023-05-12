package org.example.View.Input;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class InputNameInfo implements Input {
    @Override
    public String print(){
        System.out.println("Information: ");
        return new Scanner(System.in).nextLine();
    }
}
