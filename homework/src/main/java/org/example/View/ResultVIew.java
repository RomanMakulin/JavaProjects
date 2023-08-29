package org.example.View;

import org.example.Controller.Actions;

public class ResultVIew {
    /**
     * Функция вывода результата действий калькулятора в консоль
     */
    public void show(){
        System.out.println("Your result: " + Actions.sum(2, 4));
    }
}
