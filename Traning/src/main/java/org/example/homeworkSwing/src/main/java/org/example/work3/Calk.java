package org.example.work3;

//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
//        sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа
//        (но необязательно разного между собой), над которыми должна быть произведена операция.
public class Calk {
    public <T extends Number, N extends Number> double sum(T a, N b) {
        return a.doubleValue() + b.doubleValue();
    }
    public <T extends Number, N extends Number> double multiply(T a, N b) {
        return a.doubleValue() * b.doubleValue();
    }

    public <T extends Number, N extends Number> double divide(T a, N b) {
        return a.doubleValue() / b.doubleValue();
    }

    public <T extends Number, N extends Number> double subtract(T a, N b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        Calk calk = new Calk();
        System.out.println(calk.sum(2, 2.5));
        System.out.println(calk.multiply(2.5, 2));
        System.out.println(calk.divide(2, 3));
        System.out.println(calk.subtract(8.5, 2));
    }
}
