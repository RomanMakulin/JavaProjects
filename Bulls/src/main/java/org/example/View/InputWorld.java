package org.example.View;

import org.example.Model.Interfaces.InputString;
import java.util.Scanner;

public class InputWorld implements InputString {
    @Override
    public String input() {
        System.out.println("Введите слово: ");
        return new Scanner(System.in).next();
    }
}
