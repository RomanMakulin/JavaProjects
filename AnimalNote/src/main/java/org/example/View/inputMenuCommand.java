package org.example.View;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class inputMenuCommand implements Input {
    public String input(){
        System.out.print("Command: ");
        return new Scanner(System.in).nextLine();
    }
}
