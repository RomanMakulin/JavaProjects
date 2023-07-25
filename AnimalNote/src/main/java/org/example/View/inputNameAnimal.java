package org.example.View;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class inputNameAnimal implements Input {
    public String input(){
        System.out.print("Name: ");
        return new Scanner(System.in).nextLine();
    }
}
