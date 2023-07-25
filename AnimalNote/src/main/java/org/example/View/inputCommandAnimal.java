package org.example.View;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class inputCommandAnimal{
    public List<String> input(){
        System.out.print("Введите команды через запятую: ");
        String[] str = new Scanner(System.in).nextLine().split(",");
        List<String> commands = Arrays.asList(str);
        return commands;
    }
}
