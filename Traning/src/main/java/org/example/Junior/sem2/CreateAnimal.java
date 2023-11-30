package org.example.Junior.sem2;

import org.example.Junior.sem2.Model.Animal;
import org.example.Junior.sem2.Model.Cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CreateAnimal {
    public Animal newAnimal(Class<?> animnalClass, String name, int age) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Constructor<?> catConstructor = animnalClass.getDeclaredConstructor(); // Получаем все конструкторы
        catConstructor.setAccessible(true); // Изменяем параметр доступности
        Animal needAnimal = (Animal) catConstructor.newInstance(); // Создаем объект

        // Получаем необходимые поля
        Field nameField = animnalClass.getSuperclass().getDeclaredField("name");
        Field ageField = animnalClass.getSuperclass().getDeclaredField("age");

        // Даем разрешение на редактирование
        nameField.setAccessible(true);
        ageField.setAccessible(true);

        // Редактируем поля
        nameField.set(needAnimal, name);
        ageField.set(needAnimal, age);

        return needAnimal;
    }
}
