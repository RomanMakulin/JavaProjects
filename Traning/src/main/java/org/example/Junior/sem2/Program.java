package org.example.Junior.sem2;

import org.example.Junior.sem2.Model.Animal;
import org.example.Junior.sem2.Model.Cat;
import org.example.Junior.sem2.Model.Dog;
import org.example.Junior.sem2.Model.MethodsAnimals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
//        Создайте абстрактный класс "Animal" с полями "name" и "age".
//        Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
//        Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
//        Выведите на экран информацию о каждом объекте.
//        Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.

        List<Animal> animals = Arrays.asList(
                new CreateAnimal().newAnimal(Cat.class, "Milka", 2),
                new CreateAnimal().newAnimal(Cat.class, "Anfiska", 10),
                new CreateAnimal().newAnimal(Dog.class, "Rex", 5)
        );

        animals.forEach(animal -> System.out.println(animal + ", class = " + animal.getClass()));
        new MethodsAnimals().getMethods(animals);

    }
}
