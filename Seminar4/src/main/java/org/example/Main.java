package org.example;

public class Main {
    public static void main(String[] args) {

        GenericBox<String> first = new GenericBox<>("abc");
        GenericBox<Integer> firstNum = new GenericBox<>(10);
        GenericBox<Integer> secondNum = new GenericBox<>(20);

        int sum = firstNum.getObj() + secondNum.getObj();
        System.out.println("sum int: " + sum);

    }
}