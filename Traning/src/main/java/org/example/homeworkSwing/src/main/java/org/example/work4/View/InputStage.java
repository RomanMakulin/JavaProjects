package org.example.work4.View;

import java.util.Scanner;

public class InputStage{
    public Integer inputDate() {
        System.out.print("Input stage: ");
        return new Scanner(System.in).nextInt();
    }
}
