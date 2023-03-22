package org.example.View;

import java.util.Scanner;

public class GetInf {
    public String inputName(String string){
        System.out.println(string);
        return new Scanner(System.in).nextLine();
    }
}
