package org.example.View;

import org.example.Model.Interfaces.InputInt;
import java.util.Scanner;

public class WorldSizeInput implements InputInt {
    @Override
    public int print(){
        System.out.println("Введите длину слова: ");
        return new Scanner(System.in).nextInt();
    }
}
