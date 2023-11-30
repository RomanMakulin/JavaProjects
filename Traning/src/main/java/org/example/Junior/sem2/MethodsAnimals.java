package org.example.Junior.sem2;

import org.example.Junior.sem2.Model.Animal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class MethodsAnimals {
    public void getMethods(List<Animal> animals){
        for (Animal animal : animals) {
            try {
                Method soundAnimal = animal.getClass().getDeclaredMethod("soundAction");
                soundAnimal.invoke(animal);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ignored) {
            }
        }
    }
}
