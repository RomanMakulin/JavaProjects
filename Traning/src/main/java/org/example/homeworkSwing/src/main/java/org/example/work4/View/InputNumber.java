package org.example.work4.View;

import java.util.Scanner;

public class InputNumber implements Input{
    @Override
    public String inputDate() {
        System.out.print("Input phone number: ");
        return new Scanner(System.in).next();
    }
}
