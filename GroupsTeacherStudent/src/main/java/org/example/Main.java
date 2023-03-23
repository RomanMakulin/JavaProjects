package org.example;
import org.example.Controller.Controller;
import org.example.Controller.GroupCount;
import org.example.View.GetInf;

public class Main {
    public static void main(String[] args) {
//        new GroupCount().buttonClick(new GetInf()); // Создание нескольких групп сразу
        new Controller().completeGroup(new GetInf());
    }
}
