package org.example;

import org.example.controller.MainController;
import org.example.repository.ArrLists;
import org.example.service.ArrServiceImpl;

public class Main {
    public static void main(String[] args) {

        ArrLists arrLists = new ArrLists(); // сделал для mickito..
        ArrServiceImpl arrService = new ArrServiceImpl(); // сделал для mickito..

        new MainController(arrLists, arrService).btnClick();
    }
}