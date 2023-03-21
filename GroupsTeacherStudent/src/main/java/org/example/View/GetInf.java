package org.example.View;

import java.util.Scanner;

public class GetInf {
    public String inputName(String string){
        Scanner scanner = new Scanner(System.in);
        System.out.println(string);
        return scanner.nextLine();
    }
}
