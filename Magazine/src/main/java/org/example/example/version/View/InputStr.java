package org.example.example.version.View;

import java.util.Scanner;

public class InputStr {
    public String input(String str){
        System.out.println(str);
        return new Scanner(System.in).nextLine();
    }
}
