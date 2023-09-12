package org.example.homeWork4.View;

import java.util.Scanner;

public class ViewSizeInput {
    public int input(String str){
        System.out.print(str);
        return new Scanner(System.in).nextInt();
    }
}
