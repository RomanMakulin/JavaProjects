package org.example.View;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class inputType implements Input {
    public String input(){
        System.out.print("Вид животного (cat, dog и т. д..: ");
        return new Scanner(System.in).nextLine();
    }
}
