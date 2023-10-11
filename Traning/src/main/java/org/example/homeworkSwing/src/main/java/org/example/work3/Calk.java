package org.example.work3;

//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
//        sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа
//        (но необязательно разного между собой), над которыми должна быть произведена операция.
public class Calk {
    public <T extends Number> T sum(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    public <T extends Number> T multiply(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
    }

    public <T extends Number> T divide(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
    }

    public <T extends Number> T subtract(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
    }

    public static void main(String[] args) {
        Calk calk = new Calk();
        System.out.println(calk.sum(2, 2.5));
        System.out.println(calk.multiply(2.5, 2));
        System.out.println(calk.divide(5, 2.5));
        System.out.println(calk.subtract(8.5, 2));
    }
}
