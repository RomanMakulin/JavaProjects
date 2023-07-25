package org.example.View;

import org.example.Model.Interfaces.Input;

import java.util.Scanner;

public class inputDateBith implements Input {
    public String input(){
        System.out.print("Date [yyyy-mm-dd]: ");
        return new Scanner(System.in).nextLine();
    }
}
