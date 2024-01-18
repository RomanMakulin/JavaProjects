package org.example.controller;

import org.example.repository.ArrLists;
import org.example.service.ArrServiceImpl;

import java.util.List;

public class MainController {
    ArrLists arrLists;
    ArrServiceImpl arrService;

    public MainController(ArrLists arrLists, ArrServiceImpl arrService) {
        this.arrLists = arrLists;
        this.arrService = arrService;
    }

    public void btnClick(){
        List<Integer> list1 = arrLists.getList1();
        List<Integer> list2 = arrLists.getList2();

        double num1 = arrService.averageList(list1);
        double num2 = arrService.averageList(list2);

        System.out.println("Среднее значение первого списка: " + num1);
        System.out.println("Среднее значение второго списка: " + num2);
        arrService.checkValues(num1, num2);
    }
}
