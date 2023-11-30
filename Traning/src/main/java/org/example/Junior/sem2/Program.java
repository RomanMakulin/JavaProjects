package org.example.Junior.sem2;

import org.example.Junior.sem2.Model.Animal;
import org.example.Junior.sem2.Model.Cat;
import org.example.Junior.sem2.Model.Dog;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {

        List<Animal> animals = Arrays.asList(
                new CreateAnimal().newAnimal(Cat.class, "Milka", 2),
                new CreateAnimal().newAnimal(Cat.class, "Anfiska", 10),
                new CreateAnimal().newAnimal(Dog.class, "Rex", 5)
        );

        animals.forEach(animal -> System.out.println(animal + ", class = " + animal.getClass()));
        new MethodsAnimals().getMethods(animals);

    }
}
