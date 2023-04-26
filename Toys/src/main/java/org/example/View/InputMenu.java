package org.example.View;

import org.example.Model.Interfaces.InputString;

import java.util.Scanner;

public class InputMenu implements InputString {
    @Override
    public String input(){
        System.out.println("\n** Добрый день! Вы находитесь в интерактивном меню нашего первого сезонного розыгрыша **\n" +
                "** Выберите действие: **\n\n" +
                "1 - показать список игрушек в розыгрыше\n" +
                "2 - добавить новую игрушку в розыгрыш\n" +
                "3 - изменить вес игрушки\n" +
                "4 - провести розыгрыш\n" +
                "5 - показать мой список наград");
        return new Scanner(System.in).nextLine();
    }
}
