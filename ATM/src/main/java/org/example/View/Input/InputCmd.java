package org.example.View.Input;

import org.example.Model.Interfaces.InputStr;

import java.util.Scanner;

public class InputCmd implements InputStr {
    @Override
    public String input() {
        System.out.print("cmd: ");
        return new Scanner(System.in).nextLine();
    }
}
