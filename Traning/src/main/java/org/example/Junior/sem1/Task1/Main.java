package org.example.Junior.sem1.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//    Напишите программу, которая использует Stream API для обработки списка чисел.
//    Программа должна вывести на экран среднее значение всех четных чисел в списке.

        List<Integer> integerList = Arrays.asList(1, 2, 10, 4, 3, 23);

        double a = integerList.stream().filter(x -> x%2 == 0).reduce(Integer::sum).get();
        List<Integer> ls2 = integerList.stream().filter(x -> x%2 == 0).toList();

        System.out.println(a + " / " + ls2.size() + " = " + a/ls2.size());
    }
}
