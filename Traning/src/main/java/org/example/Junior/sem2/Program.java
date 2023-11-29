package org.example.Junior.sem2;

import org.example.Junior.sem2.Model.Animal;
import org.example.Junior.sem2.Model.Cat;
import org.example.Junior.sem2.Model.Dog;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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


        Class<?>[] animalList = List.of(
                Class.forName("org.example.Junior.sem2.Model.Cat"),
                Class.forName("org.example.Junior.sem2.Model.Dog"),
                Class.forName("org.example.Junior.sem2.Model.Cat")).toArray(new Class[0]);

        List<Object> animals = new ArrayList<>();


        for (int i = 0; i < animalList.length; i++) {
            Constructor<?>[] constructors = animalList[i].getConstructors();
            animals.add(constructors[0].newInstance());
        }

        System.out.println(animals);



    }
}
