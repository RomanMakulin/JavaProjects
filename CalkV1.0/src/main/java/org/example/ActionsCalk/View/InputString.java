package org.example.ActionsCalk.View;

import java.util.Scanner;

public class InputString {
    public String inp(String str){
        System.out.println(str);
        return new Scanner(System.in).nextLine();
    }
}
