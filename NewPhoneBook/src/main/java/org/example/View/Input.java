package org.example.View;

import java.util.Scanner;

public class Input {
    public String input(String str){
        System.out.println(str);
        return new Scanner(System.in).nextLine();
    }
}
