package org.example.work4.View;

import java.util.Scanner;

public class InputName implements Input{
    @Override
    public String inputDate(){
        System.out.print("Input name: ");
        return new Scanner(System.in).next();
    }
}
