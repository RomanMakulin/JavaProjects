package org.example.Controller;

/**
 * Класс действий калькулятора
 */
public class Actions {

    /**
     * Функция суммы чисел
     * @param a первое число
     * @param b второе число
     * @return результат
     */
    public static int sum(int a, int b){
        return a+b;
    }
    /**
     * Функция разности чисел
     * @param a первое число
     * @param b второе число
     * @return результат
     */
    public static int min(int a, int b){
        return a-b;
    }
    /**
     * Функция умножения чисел
     * @param a первое число
     * @param b второе число
     * @return результат
     */
    public static int mult(int a, int b){
        return a*b;
    }
    /**
     * Функция деления чисел
     * @param a первое число
     * @param b второе число
     * @return результат
     */
    public static double div(double a, double b){
        return a/b;
    }
}
