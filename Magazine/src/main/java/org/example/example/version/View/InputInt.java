package org.example.example.version.View;

import java.util.Scanner;

public class InputInt {
    public int input(String str){
        System.out.println(str);
        return new Scanner(System.in).nextInt();
    }
}
