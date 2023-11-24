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
        double avg = integerList.stream().filter(x -> x%2 == 0).mapToInt(a -> a).average().getAsDouble();
        System.out.println(avg);
    }
}
