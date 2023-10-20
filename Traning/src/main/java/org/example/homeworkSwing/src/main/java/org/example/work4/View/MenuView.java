package org.example.work4.View;

import java.util.Scanner;

public class MenuView {
    public String switchMenu(){
        System.out.println("Menu: \n" +
                "1 - Добавить нового сотрудника\n" +
                "2 - Отсортировать сотрудников по стажу\n" +
                "3 - Вывести номера телефонов по имени сотрудника\n" +
                "4 - Вывести сотрудника по табельному номеру\n" +
                "5 - Показать всех сотрудников\n" +
                "6 - Выход");
        System.out.print("\nPrint option: \n");
        return new Scanner(System.in).next();
    }
}
