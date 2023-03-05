package org.example;

public class Main {
    public static void main(String[] args) {

        Animal[] animal = {
                new Dog("Рекс"),
                new HomeCat("Милка"),
                new Tiger("Шархан", 50)
        };

        for (Animal item : animal) {
            item.run(150);
            item.swim(10);
        }
        System.out.println();
        System.out.println("Кол-во животных: " + Animal.count);
        System.out.println("Кол-во кошек: " + Cat.catCount);

    }
}