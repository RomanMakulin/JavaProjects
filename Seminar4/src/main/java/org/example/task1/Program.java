package org.example.task1;

public class Program {
    public static void main(String[] args) {
        BoxNumbers<Integer> first = new BoxNumbers<>(2, 4, 5, 2);
        BoxNumbers<Integer> second = new BoxNumbers<>(5, 2, 6, 1);
        BoxNumbers<Double> third = new BoxNumbers<>(5.0, 2.0, 6.0, 1.0);

        System.out.println(first.average());
        System.out.println(second.average());
        System.out.println(first.compareAverage(second));
        System.out.println(first.compareAverage(third));

    }
}
