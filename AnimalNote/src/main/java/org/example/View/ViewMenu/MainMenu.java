package org.example.View.ViewMenu;

import org.example.Model.Interfaces.Menu;

public class MainMenu implements Menu {
    @Override
    public void menu() {
        System.out.println("\nМеню: \n" +
                "0 - Дать информацию по животному\n" +
                "1 - Завести новое животное\n" +
                "2 - Определять животное в правильный класс\n" +
                "3 - Увидеть список команд, которое выполняет животное\n" +
                "4 - Обучить животное новым командам\n" +
                "5 - Выход\n");
    }
}
