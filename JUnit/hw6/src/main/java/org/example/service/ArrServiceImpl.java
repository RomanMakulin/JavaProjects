package org.example.service;

import org.example.repository.ArrLists;

import java.util.List;

public class ArrServiceImpl implements ArrService{
    @Override
    public double averageList(List<Integer> list) {
        return list.stream().mapToDouble(e -> e).average().orElse(Double.NaN);
    }

    @Override
    public double checkValues(double num1, double num2) {
        if (num1 > num2) {
            System.out.println("Первый список имеет большее среднее значение");
            return num1;
        } else if (num2 > num1) {
            System.out.println("Второй список имеет большее среднее значение");
            return num2;
        }
        else System.out.println("Средние значения равны");
        return 0;
    }
}
