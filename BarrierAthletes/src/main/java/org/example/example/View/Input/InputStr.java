package org.example.example.View.Input;

import java.util.Scanner;

public class InputStr {
    public String input(String str){
        System.out.println(str);
        return new Scanner(System.in).nextLine();
    }
}
