package org.example.View;

import java.util.Scanner;

public class Input {
    public String string(String str){
        System.out.print(str);
        return new Scanner(System.in).nextLine();
    }
    public int integer(String str){
        System.out.print(str);
        return new Scanner(System.in).nextInt();
    }
}
