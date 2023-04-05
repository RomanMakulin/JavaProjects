package org.example.example.verison1.GameMode.InputInt;

import java.util.Scanner;

public class InputSizeWorld implements InputInt{
    @Override
    public int print() {
        System.out.println("Введите длину слова: ");
        return new Scanner(System.in).nextInt();
    }
}
