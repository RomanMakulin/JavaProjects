package org.example.View;

import java.util.Scanner;

public class InputCmdMenu implements InputInt{
    @Override
    public int print(){
        System.out.println("Выберите режим игры:\n1 - Ru game\n2 - Eng game\n3 - Num game");
        return new Scanner(System.in).nextInt();
    }
}
