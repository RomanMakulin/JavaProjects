package org.example.work4.View;

import java.util.Scanner;

public class InputStage implements Input{
    @Override
    public Integer inputDate() {
        System.out.print("Input stage: ");
        return new Scanner(System.in).nextInt();
    }
}
