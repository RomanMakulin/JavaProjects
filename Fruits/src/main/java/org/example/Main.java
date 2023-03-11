package org.example;

public class Main {
    public static void main(String[] args) {
        Fruit first = Fruit.APPLE;

        switch (first){
            case PEAR -> System.out.println("Груша");
        }
        switch (first){
            case APPLE -> System.out.println("Яблоко");
        }
        switch (first){
            case BANANA -> System.out.println("Банан");
        }
        switch (first){
            case ORANGE -> System.out.println("Апельсин");
        }
        switch (first){
            case PINEAPPLE -> System.out.println("Персик");
        }
    }
}